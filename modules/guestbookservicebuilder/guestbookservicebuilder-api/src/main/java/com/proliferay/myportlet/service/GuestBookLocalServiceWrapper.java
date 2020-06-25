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

package com.proliferay.myportlet.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GuestBookLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GuestBookLocalService
 * @generated
 */
public class GuestBookLocalServiceWrapper
	implements GuestBookLocalService, ServiceWrapper<GuestBookLocalService> {

	public GuestBookLocalServiceWrapper(
		GuestBookLocalService guestBookLocalService) {

		_guestBookLocalService = guestBookLocalService;
	}

	/**
	 * Adds the guest book to the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestBook the guest book
	 * @return the guest book that was added
	 */
	@Override
	public com.proliferay.myportlet.model.GuestBook addGuestBook(
		com.proliferay.myportlet.model.GuestBook guestBook) {

		return _guestBookLocalService.addGuestBook(guestBook);
	}

	@Override
	public com.proliferay.myportlet.model.GuestBook addGuestBook(
			String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestBookLocalService.addGuestBook(name, serviceContext);
	}

	/**
	 * Creates a new guest book with the primary key. Does not add the guest book to the database.
	 *
	 * @param guestBookId the primary key for the new guest book
	 * @return the new guest book
	 */
	@Override
	public com.proliferay.myportlet.model.GuestBook createGuestBook(
		long guestBookId) {

		return _guestBookLocalService.createGuestBook(guestBookId);
	}

	/**
	 * Deletes the guest book from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestBook the guest book
	 * @return the guest book that was removed
	 */
	@Override
	public com.proliferay.myportlet.model.GuestBook deleteGuestBook(
		com.proliferay.myportlet.model.GuestBook guestBook) {

		return _guestBookLocalService.deleteGuestBook(guestBook);
	}

	/**
	 * Deletes the guest book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestBookId the primary key of the guest book
	 * @return the guest book that was removed
	 * @throws PortalException if a guest book with the primary key could not be found
	 */
	@Override
	public com.proliferay.myportlet.model.GuestBook deleteGuestBook(
			long guestBookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestBookLocalService.deleteGuestBook(guestBookId);
	}

	@Override
	public com.proliferay.myportlet.model.GuestBook deleteGuestBook(
			Long guestBookId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestBookLocalService.deleteGuestBook(
			guestBookId, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestBookLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _guestBookLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _guestBookLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _guestBookLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _guestBookLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _guestBookLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _guestBookLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.proliferay.myportlet.model.GuestBook fetchGuestBook(
		long guestBookId) {

		return _guestBookLocalService.fetchGuestBook(guestBookId);
	}

	/**
	 * Returns the guest book matching the UUID and group.
	 *
	 * @param uuid the guest book's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	@Override
	public com.proliferay.myportlet.model.GuestBook
		fetchGuestBookByUuidAndGroupId(String uuid, long groupId) {

		return _guestBookLocalService.fetchGuestBookByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _guestBookLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _guestBookLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the guest book with the primary key.
	 *
	 * @param guestBookId the primary key of the guest book
	 * @return the guest book
	 * @throws PortalException if a guest book with the primary key could not be found
	 */
	@Override
	public com.proliferay.myportlet.model.GuestBook getGuestBook(
			long guestBookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestBookLocalService.getGuestBook(guestBookId);
	}

	/**
	 * Returns the guest book matching the UUID and group.
	 *
	 * @param uuid the guest book's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guest book
	 * @throws PortalException if a matching guest book could not be found
	 */
	@Override
	public com.proliferay.myportlet.model.GuestBook
			getGuestBookByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestBookLocalService.getGuestBookByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the guest books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.proliferay.myportlet.model.impl.GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of guest books
	 */
	@Override
	public java.util.List<com.proliferay.myportlet.model.GuestBook>
		getGuestBooks(int start, int end) {

		return _guestBookLocalService.getGuestBooks(start, end);
	}

	@Override
	public java.util.List<com.proliferay.myportlet.model.GuestBook>
		getGuestBooks(long groupId) {

		return _guestBookLocalService.getGuestBooks(groupId);
	}

	@Override
	public java.util.List<com.proliferay.myportlet.model.GuestBook>
		getGuestBooks(long groupId, int start, int end) {

		return _guestBookLocalService.getGuestBooks(groupId, start, end);
	}

	@Override
	public java.util.List<com.proliferay.myportlet.model.GuestBook>
		getGuestBooks(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.proliferay.myportlet.model.GuestBook> obc) {

		return _guestBookLocalService.getGuestBooks(groupId, start, end, obc);
	}

	/**
	 * Returns all the guest books matching the UUID and company.
	 *
	 * @param uuid the UUID of the guest books
	 * @param companyId the primary key of the company
	 * @return the matching guest books, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.proliferay.myportlet.model.GuestBook>
		getGuestBooksByUuidAndCompanyId(String uuid, long companyId) {

		return _guestBookLocalService.getGuestBooksByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of guest books matching the UUID and company.
	 *
	 * @param uuid the UUID of the guest books
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching guest books, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.proliferay.myportlet.model.GuestBook>
		getGuestBooksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.proliferay.myportlet.model.GuestBook> orderByComparator) {

		return _guestBookLocalService.getGuestBooksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of guest books.
	 *
	 * @return the number of guest books
	 */
	@Override
	public int getGuestBooksCount() {
		return _guestBookLocalService.getGuestBooksCount();
	}

	@Override
	public int getGuestBooksCount(long groupId) {
		return _guestBookLocalService.getGuestBooksCount(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _guestBookLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _guestBookLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestBookLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the guest book in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param guestBook the guest book
	 * @return the guest book that was updated
	 */
	@Override
	public com.proliferay.myportlet.model.GuestBook updateGuestBook(
		com.proliferay.myportlet.model.GuestBook guestBook) {

		return _guestBookLocalService.updateGuestBook(guestBook);
	}

	@Override
	public com.proliferay.myportlet.model.GuestBook updateGuestBook(
			Long guestBookId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestBookLocalService.updateGuestBook(
			guestBookId, name, serviceContext);
	}

	@Override
	public GuestBookLocalService getWrappedService() {
		return _guestBookLocalService;
	}

	@Override
	public void setWrappedService(GuestBookLocalService guestBookLocalService) {
		_guestBookLocalService = guestBookLocalService;
	}

	private GuestBookLocalService _guestBookLocalService;

}