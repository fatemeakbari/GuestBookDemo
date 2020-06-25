package com.proliferay.myportlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.proliferay.myportlet.constants.GuestBookMVCPortletKeys;
import com.proliferay.myportlet.model.GuestBook;
import com.proliferay.myportlet.service.GuestBookLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;
import java.io.IOException;

@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.hidden",
                "com.liferay.portlet.scopeable=true",
                "javax.portlet.display-name=GuestBooksAdmin",
                "javax.portlet.expiration-cache=0",
                "javax.portlet.init-param.portlet-title-based-navigation=true",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/admin_view.jsp",
                "javax.portlet.name=" + GuestBookMVCPortletKeys.GUESTBOOK_ADMIN,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=administrator",
                "javax.portlet.supports.mime-type=text/html",
                "com.liferay.portlet.add-default-resource=true"
        },
        service = Portlet.class
)
public class GuestBookAdminPortlet extends MVCPortlet {

        @Reference
        GuestBookLocalService guestBookLocalService;


        @ProcessAction(name = "addGuestBook")
        public void addGuestBook(ActionRequest request, ActionResponse response) throws PortalException, IOException {
                ServiceContext serviceContext = ServiceContextFactory.getInstance(GuestBook.class.getName(), request);
                String name = ParamUtil.getString(request,"name");
                try {
                        guestBookLocalService.addGuestBook(name,serviceContext);
                        SessionMessages.add(request,"guestBookAdded");
                } catch (PortalException e) {
                        SessionErrors.add(request, e.getClass().getName());
                        response.sendRedirect("edit_guestBook.jsp","mvcPath");
                }
        }

        @ProcessAction(name = "updateGuestBook")
        public void updateGuestBook(ActionRequest request, ActionResponse response) throws PortalException, IOException {

                ServiceContext serviceContext = ServiceContextFactory.getInstance(GuestBook.class.getName(), request);
                long guestBookId = ParamUtil.getLong(request,"guestBookId");
                String name = ParamUtil.getString(request,"name");
                try {
                        guestBookLocalService.updateGuestBook(guestBookId,name,serviceContext);
                        SessionMessages.add(request,"guestBookUpdated");

                } catch (PortalException e) {
                        SessionErrors.add(request, e.getClass().getName());
                        response.sendRedirect("edit_guestBook.jsp","mvcPath");
                }
        }

        @ProcessAction(name = "deleteGuestBook")
        public void deleteGuestBook(ActionRequest request, ActionResponse response) throws PortalException, IOException {

                ServiceContext serviceContext = ServiceContextFactory.getInstance(GuestBook.class.getName(), request);
                long guestBookId = ParamUtil.getLong(request,"guestBookId");

                try {
                        guestBookLocalService.deleteGuestBook(guestBookId,serviceContext);
                        SessionMessages.add(request,"guestBookDeleted");

                } catch (PortalException e) {
                        SessionErrors.add(request, e.getClass().getName());
                }
        }
}
