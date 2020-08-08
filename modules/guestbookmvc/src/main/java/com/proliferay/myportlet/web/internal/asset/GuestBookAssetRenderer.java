package com.proliferay.myportlet.web.internal.asset;

import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.proliferay.myportlet.model.GuestBook;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

public class GuestBookAssetRenderer extends BaseJSPAssetRenderer<GuestBook> {
    @Override
    public String getJspPath(HttpServletRequest httpServletRequest, String template) {
        return null;
    }

    @Override
    public GuestBook getAssetObject() {
        return null;
    }

    @Override
    public long getGroupId() {
        return 0;
    }

    @Override
    public long getUserId() {
        return 0;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getUuid() {
        return null;
    }

    @Override
    public String getClassName() {
        return null;
    }

    @Override
    public long getClassPK() {
        return 0;
    }

    @Override
    public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
        return null;
    }

    @Override
    public String getTitle(Locale locale) {
        return null;
    }
}
