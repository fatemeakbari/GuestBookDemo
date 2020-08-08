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


import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.proliferay.myportlet.exception.EntryEmailException;
import com.proliferay.myportlet.exception.EntryMessageException;
import com.proliferay.myportlet.exception.EntryNameException;
import com.proliferay.myportlet.model.Entry;
import com.proliferay.myportlet.model.GuestBook;
import com.proliferay.myportlet.service.base.EntryLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.proliferay.myportlet.service.EntryLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntryLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.proliferay.myportlet.model.Entry",
	service = AopService.class
)
public class EntryLocalServiceImpl extends EntryLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.proliferay.myportlet.service.EntryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.proliferay.myportlet.service.EntryLocalServiceUtil</code>.
	 */

	@Indexable(type = IndexableType.REINDEX)
	public Entry addEntry(
			 long guestBookId, String name, String email,
			String message, ServiceContext serviceContext)
			throws PortalException {

		long groupId = serviceContext.getScopeGroupId();
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(name, email, message);

		long entryId = counterLocalService.increment();

		Entry entry = entryPersistence.create(entryId);

		entry.setUuid(serviceContext.getUuid());
		entry.setUserId(userId);
		entry.setGroupId(groupId);
		entry.setCompanyId(user.getCompanyId());
		entry.setUserName(user.getFullName());
		entry.setCreateDate(serviceContext.getCreateDate(now));
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		entry.setExpandoBridgeAttributes(serviceContext);
		entry.setGuestBookId(guestBookId);
		entry.setName(name);
		entry.setEmail(email);
		entry.setMessage(message);

		entryPersistence.update(entry);
		resourceLocalService.addResources(user.getCompanyId(),
				groupId,
				userId,
				Entry.class.getName(),
				entryId,
				false,
				true,
				true);

//		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId,
//				groupId, entry.getCreateDate(), entry.getModifiedDate(),
//				Entry.class.getName(), entryId, entry.getUuid(), 0,
//				serviceContext.getAssetCategoryIds(),
//				serviceContext.getAssetTagNames(), true, true, null, null, null, null,
//				ContentTypes.TEXT_HTML, entry.getMessage(), null, null, null,
//				null, 0, 0, null);
//
//		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(),
//				serviceContext.getAssetLinkEntryIds(),
//				AssetLinkConstants.TYPE_RELATED);
		return entry;
	}

	@Indexable(type = IndexableType.REINDEX)
	public Entry updateEntry (
			long guestBookId, long entryId, String name, String email,
			String message, ServiceContext serviceContext)
			throws PortalException, SystemException {

		Date now = new Date();

		validate(name, email, message);

		Entry entry = getEntry(entryId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUserById(userId);

		entry.setUserId(userId);
		entry.setUserName(user.getFullName());
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		entry.setName(name);
		entry.setEmail(email);
		entry.setMessage(message);
		entry.setExpandoBridgeAttributes(serviceContext);

		entryPersistence.update(entry);

		resourceLocalService.updateResources(serviceContext.getCompanyId(),
				serviceContext.getScopeGroupId(),
				Entry.class.getName(),
				entryId,
				serviceContext.getModelPermissions()
		);

//		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId,
//				entry.getGroupId(), entry.getCreateDate(), entry.getModifiedDate(),
//				Entry.class.getName(), entryId, entry.getUuid(), 0,
//				serviceContext.getAssetCategoryIds(),
//				serviceContext.getAssetTagNames(), true, true, null, null, null, null,
//				ContentTypes.TEXT_HTML, entry.getMessage(), null, null, null,
//				null, 0, 0, null);

//		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(),
//				serviceContext.getAssetLinkEntryIds(),
//				AssetLinkConstants.TYPE_RELATED);
		return entry;
	}


	@Indexable(type = IndexableType.DELETE)
	public Entry deleteEntry (long entryId)
			throws PortalException {

		Entry entry = entryPersistence.findByPrimaryKey(entryId);

		resourceLocalService.deleteResource(entry.getCompanyId(),
				Entry.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL,
				entryId);


		return deleteEntry(entry);
	}

	public Entry deleteEntry(Entry entry){

		entryPersistence.remove(entry);


		return entry;
	}

	public Entry getEntry(long entryId) throws PortalException {
		return entryPersistence.findByPrimaryKey(entryId);
	}

	public List<Entry> getEntries(long groupId, long guestBookId) {
		return entryPersistence.findByG_G(groupId, guestBookId);
	}

	public List<Entry> getEntries(long groupId, long guestBookId, int start, int end)
			throws SystemException {

		return entryPersistence.findByG_G(groupId, guestBookId, start, end);
	}

	public List<Entry> getEntries(
			long groupId, long guestBookId, int start, int end, OrderByComparator<Entry> obc) {

		return entryPersistence.findByG_G(groupId, guestBookId, start, end, obc);
	}

	public int getEntriesCount(long groupId, long guestBookId) {
		return entryPersistence.countByG_G(groupId, guestBookId);
	}

	protected void validate(String name, String email, String entry)
			throws PortalException {

		if (Validator.isNull(name)) {
			throw new EntryNameException();
		}

		if (!Validator.isEmailAddress(email)) {
			throw new EntryEmailException();
		}

		if (Validator.isNull(entry)) {
			throw new EntryMessageException();
		}
	}
}