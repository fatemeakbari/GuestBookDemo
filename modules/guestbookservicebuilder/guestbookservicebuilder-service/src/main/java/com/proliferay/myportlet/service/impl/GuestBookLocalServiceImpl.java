/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.proliferay.myportlet.service.impl;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.proliferay.myportlet.exception.GuestBookNameException;
import com.proliferay.myportlet.model.Entry;
import com.proliferay.myportlet.model.GuestBook;
import com.proliferay.myportlet.service.EntryLocalService;
import com.proliferay.myportlet.service.base.GuestBookLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the guest book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.proliferay.myportlet.service.GuestBookLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GuestBookLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.proliferay.myportlet.model.GuestBook",
	service = AopService.class
)
public class GuestBookLocalServiceImpl extends GuestBookLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.proliferay.myportlet.service.GuestBookLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.proliferay.myportlet.service.GuestBookLocalServiceUtil</code>.
	 */

//
	@Reference
	EntryLocalService entryLocalService;

	@Indexable(type = IndexableType.REINDEX)
	public GuestBook addGuestBook(String name, ServiceContext serviceContext) throws PortalException {

		validate(name);
		long groupId = serviceContext.getScopeGroupId();
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);
		Date now = new Date();
		long guestBookId = counterLocalService.increment(GuestBook.class.getName());

		GuestBook guestBook = guestBookPersistence.create(guestBookId);

		guestBook.setName(name);
		guestBook.setUserId(userId);
		guestBook.setGroupId(groupId);
		guestBook.setCompanyId(user.getCompanyId());
		guestBook.setUserName(user.getFullName());
		guestBook.setCreateDate(serviceContext.getCreateDate(now));
		guestBook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestBook.setExpandoBridgeAttributes(serviceContext);

		guestBookPersistence.update(guestBook);

		resourceLocalService.addResources(user.getCompanyId(),
				groupId,
				userId,
				GuestBook.class.getName(),
				guestBookId,
				false,
				true,
				true);
		return guestBook;

	}


	@Indexable(type = IndexableType.REINDEX)
	public GuestBook updateGuestBook(Long guestBookId, String name, ServiceContext serviceContext) throws PortalException {

		GuestBook guestBook = guestBookLocalService.getGuestBook(guestBookId);

		validate(name);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);
		Date now = new Date();

		guestBook.setName(name);
		guestBook.setUserId(userId);
		guestBook.setUserName(user.getFullName());
		guestBook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestBook.setExpandoBridgeAttributes(serviceContext);

		guestBookPersistence.update(guestBook);
		resourceLocalService.updateResources(serviceContext.getCompanyId(),
				serviceContext.getScopeGroupId(),
				GuestBook.class.getName(),
				guestBookId,
				serviceContext.getModelPermissions()
		);
		return guestBook;

	}


	@Indexable(type = IndexableType.DELETE)
	public GuestBook deleteGuestBook(Long guestBookId, ServiceContext serviceContext) throws PortalException{
		GuestBook guestBook = guestBookLocalService.getGuestBook(guestBookId);
		long groupId = serviceContext.getScopeGroupId();

		List<Entry> entries = entryLocalService.getEntries(groupId,guestBookId);

		for (Entry entry : entries) {
			entryLocalService.deleteEntry(entry.getEntryId());
		}
		guestBookLocalService.deleteGuestBook(guestBook.getGuestBookId());
		resourceLocalService.deleteResource(serviceContext.getCompanyId(),
				GuestBook.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL,
				guestBookId);

		return guestBook;
	}

	public List<GuestBook> getGuestBooks(long groupId){

		return guestBookPersistence.findByGroupId(groupId);
	}
	public List<GuestBook> getGuestBooks(long groupId, int start, int end) {

		return guestBookPersistence.findByGroupId(groupId, start, end);
	}
	public List<GuestBook> getGuestBooks(long groupId, int start, int end, OrderByComparator<GuestBook> obc){

		return guestBookPersistence.findByGroupId(groupId,start,end,obc);
	}

	public int getGuestBooksCount(long groupId){
		return guestBookPersistence.countByGroupId(groupId);
	}

	protected void validate(String name) throws PortalException{
		if(Validator.isNull(name)){
			throw new GuestBookNameException("The GuestBook name must not be null");
		}
	}
}