<%@ page import="com.liferay.petra.string.StringPool" %>
<%@ taglib prefix="pr" uri="http://java.sun.com/portlet" %>
<%@ include file="/init.jsp" %>

<liferay-ui:success key="entryAdded" message="entry-added"/>
<liferay-ui:success key="entryUpdated" message="entry-updated"/>
<liferay-ui:success key="entryDeleted" message="entry-deleted"/>
<%
    long guestBookId = (long) request.getAttribute("guestBookId");
%>


<aui:nav cssClass="nav-tabs">

    <%
        List<GuestBook> guestBooks = GuestBookLocalServiceUtil.getGuestBooks(scopeGroupId);

        for (int i = 0; i < guestBooks.size(); i++) {

            GuestBook curGuestBook = guestBooks.get(i);
            String cssClass = StringPool.BLANK;

            if (curGuestBook.getGuestBookId() == guestBookId) {
                cssClass = "active";
            }

            if (GuestBookModelPermission.contains(
                    permissionChecker, curGuestBook.getGuestBookId(), "VIEW")) {

    %>

    <portlet:renderURL var="viewPageURL">
        <portlet:param name="mvcPath" value="/view.jsp" />
        <portlet:param name="guestBookId"
                       value="<%=String.valueOf(curGuestBook.getGuestBookId())%>" />
    </portlet:renderURL>


    <aui:nav-item cssClass="<%=cssClass%>" href="${viewPageURL}"
                  label="<%=HtmlUtil.escape(curGuestBook.getName())%>" />

    <%
            }

        }
    %>

</aui:nav>



<aui:button-row cssClass="">

    <c:if test='<%= GuestBookPermission.contains(permissionChecker, scopeGroupId, "ADD_ENTRY") %>'>
        <portlet:renderURL var="addEntryURL">
            <portlet:param name="mvcPath" value="/edit_entry.jsp"/>
            <portlet:param name="guestBookId" value="<%=String.valueOf(guestBookId)%>"/>
        </portlet:renderURL>


        <aui:button onClick="${addEntryURL}" value="Add Entry" cssClass="btn btn-primary">
        </aui:button>
    </c:if>
</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=EntryLocalServiceUtil.getEntries(scopeGroupId.longValue(),guestBookId)%>" />

    <liferay-ui:search-container-row
            className="com.proliferay.myportlet.model.Entry" modelVar="entry">

        <liferay-ui:search-container-column-text property="name" />
        <liferay-ui:search-container-column-text property="message" />


        <liferay-ui:search-container-column-jsp
                align="right"
                path="/entry_action.jsp" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

</liferay-ui:search-container>

