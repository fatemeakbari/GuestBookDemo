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

package com.proliferay.myportlet.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.proliferay.myportlet.model.GuestBook;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the guest book service. This utility wraps <code>com.proliferay.myportlet.service.persistence.impl.GuestBookPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GuestBookPersistence
 * @generated
 */
public class GuestBookUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(GuestBook guestBook) {
		getPersistence().clearCache(guestBook);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, GuestBook> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GuestBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GuestBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GuestBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GuestBook update(GuestBook guestBook) {
		return getPersistence().update(guestBook);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GuestBook update(
		GuestBook guestBook, ServiceContext serviceContext) {

		return getPersistence().update(guestBook, serviceContext);
	}

	/**
	 * Returns all the guest books where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching guest books
	 */
	public static List<GuestBook> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the guest books where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of matching guest books
	 */
	public static List<GuestBook> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the guest books where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guest books
	 */
	public static List<GuestBook> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the guest books where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guest books
	 */
	public static List<GuestBook> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GuestBook> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first guest book in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public static GuestBook findByUuid_First(
			String uuid, OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first guest book in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public static GuestBook fetchByUuid_First(
		String uuid, OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last guest book in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public static GuestBook findByUuid_Last(
			String uuid, OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last guest book in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public static GuestBook fetchByUuid_Last(
		String uuid, OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the guest books before and after the current guest book in the ordered set where uuid = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public static GuestBook[] findByUuid_PrevAndNext(
			long guestBookId, String uuid,
			OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByUuid_PrevAndNext(
			guestBookId, uuid, orderByComparator);
	}

	/**
	 * Removes all the guest books where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of guest books where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching guest books
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the guest book where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGuestBookException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public static GuestBook findByUUID_G(String uuid, long groupId)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the guest book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public static GuestBook fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the guest book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public static GuestBook fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the guest book where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the guest book that was removed
	 */
	public static GuestBook removeByUUID_G(String uuid, long groupId)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of guest books where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching guest books
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the guest books where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching guest books
	 */
	public static List<GuestBook> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the guest books where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of matching guest books
	 */
	public static List<GuestBook> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the guest books where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guest books
	 */
	public static List<GuestBook> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the guest books where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guest books
	 */
	public static List<GuestBook> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GuestBook> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public static GuestBook findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public static GuestBook fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public static GuestBook findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public static GuestBook fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the guest books before and after the current guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public static GuestBook[] findByUuid_C_PrevAndNext(
			long guestBookId, String uuid, long companyId,
			OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByUuid_C_PrevAndNext(
			guestBookId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the guest books where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of guest books where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching guest books
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the guest books where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching guest books
	 */
	public static List<GuestBook> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the guest books where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of matching guest books
	 */
	public static List<GuestBook> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the guest books where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guest books
	 */
	public static List<GuestBook> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the guest books where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guest books
	 */
	public static List<GuestBook> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<GuestBook> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first guest book in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public static GuestBook findByGroupId_First(
			long groupId, OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first guest book in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public static GuestBook fetchByGroupId_First(
		long groupId, OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last guest book in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public static GuestBook findByGroupId_Last(
			long groupId, OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last guest book in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public static GuestBook fetchByGroupId_Last(
		long groupId, OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the guest books before and after the current guest book in the ordered set where groupId = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public static GuestBook[] findByGroupId_PrevAndNext(
			long guestBookId, long groupId,
			OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByGroupId_PrevAndNext(
			guestBookId, groupId, orderByComparator);
	}

	/**
	 * Returns all the guest books that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching guest books that the user has permission to view
	 */
	public static List<GuestBook> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the guest books that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of matching guest books that the user has permission to view
	 */
	public static List<GuestBook> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the guest books that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guest books that the user has permission to view
	 */
	public static List<GuestBook> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the guest books before and after the current guest book in the ordered set of guest books that the user has permission to view where groupId = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public static GuestBook[] filterFindByGroupId_PrevAndNext(
			long guestBookId, long groupId,
			OrderByComparator<GuestBook> orderByComparator)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			guestBookId, groupId, orderByComparator);
	}

	/**
	 * Removes all the guest books where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of guest books where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching guest books
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of guest books that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching guest books that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Caches the guest book in the entity cache if it is enabled.
	 *
	 * @param guestBook the guest book
	 */
	public static void cacheResult(GuestBook guestBook) {
		getPersistence().cacheResult(guestBook);
	}

	/**
	 * Caches the guest books in the entity cache if it is enabled.
	 *
	 * @param guestBooks the guest books
	 */
	public static void cacheResult(List<GuestBook> guestBooks) {
		getPersistence().cacheResult(guestBooks);
	}

	/**
	 * Creates a new guest book with the primary key. Does not add the guest book to the database.
	 *
	 * @param guestBookId the primary key for the new guest book
	 * @return the new guest book
	 */
	public static GuestBook create(long guestBookId) {
		return getPersistence().create(guestBookId);
	}

	/**
	 * Removes the guest book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestBookId the primary key of the guest book
	 * @return the guest book that was removed
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public static GuestBook remove(long guestBookId)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().remove(guestBookId);
	}

	public static GuestBook updateImpl(GuestBook guestBook) {
		return getPersistence().updateImpl(guestBook);
	}

	/**
	 * Returns the guest book with the primary key or throws a <code>NoSuchGuestBookException</code> if it could not be found.
	 *
	 * @param guestBookId the primary key of the guest book
	 * @return the guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public static GuestBook findByPrimaryKey(long guestBookId)
		throws com.proliferay.myportlet.exception.NoSuchGuestBookException {

		return getPersistence().findByPrimaryKey(guestBookId);
	}

	/**
	 * Returns the guest book with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param guestBookId the primary key of the guest book
	 * @return the guest book, or <code>null</code> if a guest book with the primary key could not be found
	 */
	public static GuestBook fetchByPrimaryKey(long guestBookId) {
		return getPersistence().fetchByPrimaryKey(guestBookId);
	}

	/**
	 * Returns all the guest books.
	 *
	 * @return the guest books
	 */
	public static List<GuestBook> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the guest books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of guest books
	 */
	public static List<GuestBook> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the guest books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of guest books
	 */
	public static List<GuestBook> findAll(
		int start, int end, OrderByComparator<GuestBook> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the guest books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of guest books
	 */
	public static List<GuestBook> findAll(
		int start, int end, OrderByComparator<GuestBook> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the guest books from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of guest books.
	 *
	 * @return the number of guest books
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GuestBookPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<GuestBookPersistence, GuestBookPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(GuestBookPersistence.class);

		ServiceTracker<GuestBookPersistence, GuestBookPersistence>
			serviceTracker =
				new ServiceTracker<GuestBookPersistence, GuestBookPersistence>(
					bundle.getBundleContext(), GuestBookPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}