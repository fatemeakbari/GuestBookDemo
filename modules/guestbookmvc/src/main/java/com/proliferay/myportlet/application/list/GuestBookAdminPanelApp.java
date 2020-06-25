package com.proliferay.myportlet.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;
import com.proliferay.myportlet.constants.GuestBookMVCPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
        immediate = true,
        property = {
                "panel.app.order:Integer=300",
                "panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT
        },
        service = PanelApp.class
)
public class GuestBookAdminPanelApp extends BasePanelApp {
    @Override
    public String getPortletId() {
        return GuestBookMVCPortletKeys.GUESTBOOK_ADMIN;
    }


    @Override
    @Reference(
            target = "(javax.portlet.name=" + GuestBookMVCPortletKeys.GUESTBOOK_ADMIN + ")",
            unbind = "-"
    )
    public void setPortlet(Portlet portlet) {
        super.setPortlet(portlet);
    }
}
