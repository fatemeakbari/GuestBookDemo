package com.proliferay.myportlet.web.internal.security.permission.resource;

import com.proliferay.myportlet.model.Entry;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;

@Component(immediate = true)
public class EntryModelPermission {

    public static boolean contains(
            PermissionChecker permissionChecker, Entry entry, String actionId) throws PortalException {

        return _entryModelResourcePermission.contains(permissionChecker, entry, actionId);
    }

    public static boolean contains(
            PermissionChecker permissionChecker, long entryId, String actionId) throws PortalException {


        return _entryModelResourcePermission.contains(permissionChecker, entryId, actionId);
    }

    @Reference(
            target = "(model.class.name=com.proliferay.myportlet.model.Entry)",
            unbind = "-")
    protected void setEntryModelPermission(ModelResourcePermission<Entry> modelResourcePermission) {

        _entryModelResourcePermission = modelResourcePermission;
    }

    private static ModelResourcePermission<Entry>_entryModelResourcePermission;

}