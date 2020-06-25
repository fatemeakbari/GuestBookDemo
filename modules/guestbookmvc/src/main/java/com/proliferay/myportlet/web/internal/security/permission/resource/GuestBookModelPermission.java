package com.proliferay.myportlet.web.internal.security.permission.resource;

import com.proliferay.myportlet.model.GuestBook;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;

@Component(immediate = true)
public class GuestBookModelPermission {

    public static boolean contains(
            PermissionChecker permissionChecker, GuestBook guestBook, String actionId) throws PortalException {

            return _guestBookModelResourcePermission.contains(permissionChecker, guestBook, actionId);
    }

    public static boolean contains(
            PermissionChecker permissionChecker, long guestBookId, String actionId) throws PortalException {

            return _guestBookModelResourcePermission.contains(permissionChecker, guestBookId, actionId);
    }

    @Reference(
            target = "(model.class.name=com.proliferay.myportlet.model.GuestBook)",
            unbind = "-")
    protected void setEntryModelPermission(ModelResourcePermission<GuestBook> modelResourcePermission) {

        _guestBookModelResourcePermission = modelResourcePermission;
    }



    private static ModelResourcePermission<GuestBook>_guestBookModelResourcePermission;

}