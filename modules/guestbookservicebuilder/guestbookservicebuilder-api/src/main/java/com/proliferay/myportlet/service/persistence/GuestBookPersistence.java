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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.proliferay.myportlet.exception.NoSuchGuestBookException;
import com.proliferay.myportlet.model.GuestBook;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the guest book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GuestBookUtil
 * @generated
 */
@ProviderType
public interface GuestBookPersistence extends BasePersistence<GuestBook> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GuestBookUtil} to access the guest book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the guest books where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching guest books
	 */
	public java.util.List<GuestBook> findByUuid(String uuid);

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
	public java.util.List<GuestBook> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<GuestBook> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

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
	public java.util.List<GuestBook> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guest book in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the first guest book in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the last guest book in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the last guest book in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the guest books before and after the current guest book in the ordered set where uuid = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public GuestBook[] findByUuid_PrevAndNext(
			long guestBookId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Removes all the guest books where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of guest books where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching guest books
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the guest book where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGuestBookException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByUUID_G(String uuid, long groupId)
		throws NoSuchGuestBookException;

	/**
	 * Returns the guest book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the guest book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the guest book where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the guest book that was removed
	 */
	public GuestBook removeByUUID_G(String uuid, long groupId)
		throws NoSuchGuestBookException;

	/**
	 * Returns the number of guest books where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching guest books
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the guest books where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching guest books
	 */
	public java.util.List<GuestBook> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<GuestBook> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<GuestBook> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

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
	public java.util.List<GuestBook> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the first guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the last guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the last guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

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
	public GuestBook[] findByUuid_C_PrevAndNext(
			long guestBookId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Removes all the guest books where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of guest books where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching guest books
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the guest books where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching guest books
	 */
	public java.util.List<GuestBook> findByGroupId(long groupId);

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
	public java.util.List<GuestBook> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<GuestBook> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

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
	public java.util.List<GuestBook> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guest book in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the first guest book in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the last guest book in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the last guest book in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the guest books before and after the current guest book in the ordered set where groupId = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public GuestBook[] findByGroupId_PrevAndNext(
			long guestBookId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns all the guest books that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching guest books that the user has permission to view
	 */
	public java.util.List<GuestBook> filterFindByGroupId(long groupId);

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
	public java.util.List<GuestBook> filterFindByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<GuestBook> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the guest books before and after the current guest book in the ordered set of guest books that the user has permission to view where groupId = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public GuestBook[] filterFindByGroupId_PrevAndNext(
			long guestBookId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Removes all the guest books where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of guest books where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching guest books
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of guest books that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching guest books that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the guest books where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching guest books
	 */
	public java.util.List<GuestBook> findByStatus(int status);

	/**
	 * Returns a range of all the guest books where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of matching guest books
	 */
	public java.util.List<GuestBook> findByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the guest books where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guest books
	 */
	public java.util.List<GuestBook> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guest books where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guest books
	 */
	public java.util.List<GuestBook> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guest book in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the first guest book in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the last guest book in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the last guest book in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the guest books before and after the current guest book in the ordered set where status = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public GuestBook[] findByStatus_PrevAndNext(
			long guestBookId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Removes all the guest books where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeByStatus(int status);

	/**
	 * Returns the number of guest books where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching guest books
	 */
	public int countByStatus(int status);

	/**
	 * Returns all the guest books where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching guest books
	 */
	public java.util.List<GuestBook> findByG_S(long groupId, int status);

	/**
	 * Returns a range of all the guest books where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of matching guest books
	 */
	public java.util.List<GuestBook> findByG_S(
		long groupId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the guest books where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guest books
	 */
	public java.util.List<GuestBook> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guest books where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guest books
	 */
	public java.util.List<GuestBook> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guest book in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the first guest book in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the last guest book in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book
	 * @throws NoSuchGuestBookException if a matching guest book could not be found
	 */
	public GuestBook findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns the last guest book in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	 */
	public GuestBook fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the guest books before and after the current guest book in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public GuestBook[] findByG_S_PrevAndNext(
			long guestBookId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Returns all the guest books that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching guest books that the user has permission to view
	 */
	public java.util.List<GuestBook> filterFindByG_S(long groupId, int status);

	/**
	 * Returns a range of all the guest books that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @return the range of matching guest books that the user has permission to view
	 */
	public java.util.List<GuestBook> filterFindByG_S(
		long groupId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the guest books that the user has permissions to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuestBookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of guest books
	 * @param end the upper bound of the range of guest books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guest books that the user has permission to view
	 */
	public java.util.List<GuestBook> filterFindByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

	/**
	 * Returns the guest books before and after the current guest book in the ordered set of guest books that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param guestBookId the primary key of the current guest book
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public GuestBook[] filterFindByG_S_PrevAndNext(
			long guestBookId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
				orderByComparator)
		throws NoSuchGuestBookException;

	/**
	 * Removes all the guest books where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of guest books where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching guest books
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns the number of guest books that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching guest books that the user has permission to view
	 */
	public int filterCountByG_S(long groupId, int status);

	/**
	 * Caches the guest book in the entity cache if it is enabled.
	 *
	 * @param guestBook the guest book
	 */
	public void cacheResult(GuestBook guestBook);

	/**
	 * Caches the guest books in the entity cache if it is enabled.
	 *
	 * @param guestBooks the guest books
	 */
	public void cacheResult(java.util.List<GuestBook> guestBooks);

	/**
	 * Creates a new guest book with the primary key. Does not add the guest book to the database.
	 *
	 * @param guestBookId the primary key for the new guest book
	 * @return the new guest book
	 */
	public GuestBook create(long guestBookId);

	/**
	 * Removes the guest book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestBookId the primary key of the guest book
	 * @return the guest book that was removed
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public GuestBook remove(long guestBookId) throws NoSuchGuestBookException;

	public GuestBook updateImpl(GuestBook guestBook);

	/**
	 * Returns the guest book with the primary key or throws a <code>NoSuchGuestBookException</code> if it could not be found.
	 *
	 * @param guestBookId the primary key of the guest book
	 * @return the guest book
	 * @throws NoSuchGuestBookException if a guest book with the primary key could not be found
	 */
	public GuestBook findByPrimaryKey(long guestBookId)
		throws NoSuchGuestBookException;

	/**
	 * Returns the guest book with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param guestBookId the primary key of the guest book
	 * @return the guest book, or <code>null</code> if a guest book with the primary key could not be found
	 */
	public GuestBook fetchByPrimaryKey(long guestBookId);

	/**
	 * Returns all the guest books.
	 *
	 * @return the guest books
	 */
	public java.util.List<GuestBook> findAll();

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
	public java.util.List<GuestBook> findAll(int start, int end);

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
	public java.util.List<GuestBook> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator);

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
	public java.util.List<GuestBook> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestBook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the guest books from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of guest books.
	 *
	 * @return the number of guest books
	 */
	public int countAll();

}