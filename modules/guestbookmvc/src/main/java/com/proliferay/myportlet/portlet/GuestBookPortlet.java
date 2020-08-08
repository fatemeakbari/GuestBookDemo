package com.proliferay.myportlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.proliferay.myportlet.constants.GuestBookMVCPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.proliferay.myportlet.model.Entry;
import com.proliferay.myportlet.model.GuestBook;
import com.proliferay.myportlet.service.EntryLocalService;
import com.proliferay.myportlet.service.GuestBookLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;

/**
 * @author fateme
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.social",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=GuestBookMVC",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GuestBookMVCPortletKeys.GUESTBOOK,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class GuestBookPortlet extends MVCPortlet {

    private GuestBookLocalService guestBookLocalService;

	private EntryLocalService entryLocalService;


	@Reference // I also tried with (unbind = "-")
	protected void setGuestBookLocalService(GuestBookLocalService guestBookLocalService) {
		this.guestBookLocalService = guestBookLocalService;
	}

	@Reference // I also tried with (unbind = "-")
	protected void setEntryLocalService(EntryLocalService entryLocalService) {
		this.entryLocalService = entryLocalService;
	}


	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		try {
			ServiceContext serviceContext =
					ServiceContextFactory.getInstance(GuestBook.class.getName(),renderRequest);
					long groupId = serviceContext.getScopeGroupId();
					long guestBookId = ParamUtil.getLong(renderRequest,"guestBookId");
					List<GuestBook> guestBooks = guestBookLocalService.getGuestBooks(groupId);

					if(guestBooks.isEmpty()){
						GuestBook guestBook = guestBookLocalService.addGuestBook(
								"Main",
								serviceContext);

						guestBookId = guestBook.getGuestBookId();
					}

					if(guestBookId == 0){
						guestBookId = guestBooks.get(0).getGuestBookId();
					}

					renderRequest.setAttribute("guestBookId", guestBookId);

		}
		catch (PortalException e) {
			e.printStackTrace();
		}

		super.render(renderRequest, renderResponse);
	}

	@ProcessAction(name = "addEntry")
	public void addEntry(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {

		ServiceContext serviceContext = null;
		try {
			serviceContext = ServiceContextFactory.getInstance(Entry.class.getName(),actionRequest);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		String name = ParamUtil.getString(actionRequest, "name");
		String email = ParamUtil.getString(actionRequest, "email");
		String message = ParamUtil.getString(actionRequest, "message");
		long entryId = ParamUtil.getLong(actionRequest, "entryId");
		long guestBookId = ParamUtil.getLong(actionRequest, "guestBookId");


		System.out.println("entry "+name+" "+email+" eid="+entryId+" gid="+guestBookId);

		if(entryId > 0){
			try {
				entryLocalService.updateEntry(guestBookId, entryId,name,email,message,serviceContext);
				actionResponse.setProperty(
						"guestBookId", Long.toString(guestBookId));
				SessionMessages.add(actionRequest, "entryUpdated");

			}
			catch (PortalException e) {
				e.printStackTrace();
				actionResponse.sendRedirect("edit_entry.jsp","mvcPath");
				SessionErrors.add(actionRequest, e.getClass().getName());

			}

		}
		else {
			try {
				entryLocalService.addEntry(guestBookId, name,email,message,serviceContext);
				actionResponse.setProperty(
						"guestBookId", Long.toString(guestBookId));
				SessionMessages.add(actionRequest, "entryAdded");

			}
			catch (PortalException e) {
				e.printStackTrace();
				actionResponse.sendRedirect("edit_entry.jsp","mvcPath");
				SessionErrors.add(actionRequest, e.getClass().getName());

			}

		}
	}

	public void deleteEntry(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		long entryId = ParamUtil.getLong(actionRequest,"entryId");
		long guestBookId = ParamUtil.getLong(actionRequest,"guestBookId");

    System.out.println("en id "+entryId+" "+guestBookId);
		entryLocalService.deleteEntry(entryId);
		actionResponse.setProperty("guestBookId", String.valueOf(guestBookId));
		SessionMessages.add(actionRequest, "entryDeleted");

	}
}