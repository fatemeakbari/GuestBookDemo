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
 * Provides a wrapper for {@link GuestBookService}.
 *
 * @author Brian Wing Shun Chan
 * @see GuestBookService
 * @generated
 */
public class GuestBookServiceWrapper
	implements GuestBookService, ServiceWrapper<GuestBookService> {

	public GuestBookServiceWrapper(GuestBookService guestBookService) {
		_guestBookService = guestBookService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _guestBookService.getOSGiServiceIdentifier();
	}

	@Override
	public GuestBookService getWrappedService() {
		return _guestBookService;
	}

	@Override
	public void setWrappedService(GuestBookService guestBookService) {
		_guestBookService = guestBookService;
	}

	private GuestBookService _guestBookService;

}