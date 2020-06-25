package com.proliferay.myportlet.web.internal.security.permission.resource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.proliferay.myportlet.constants.GuestBookConstants;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;

/*
* This class is a component defining one static method (so you don’t have to instantiate the class)
*  that encapsulates the model you’re checking permissions for. Liferay’s PermissionChecker class does most of the work: give it the proper resource and action, such as ADD_ENTRY, and it returns whether the permission exists or not.

There’s only one method: a check method that throws an exception if the user doesn’t have permission.
* */
@Component(immediate=true)
public class GuestBookPermission {

    public static boolean contains(PermissionChecker permissionChecker, long groupId, String actionId) {

        return _portletResourcePermission.contains(permissionChecker, groupId, actionId);

    }

    @Reference(
            target="(resource.name=" + GuestBookConstants.RESOURCE_NAME + ")",
            unbind="-"
    )
    protected void setPortletResourcePermission(PortletResourcePermission portletResourcePermission) {

        _portletResourcePermission = portletResourcePermission;
    }

    private static PortletResourcePermission _portletResourcePermission;

}
