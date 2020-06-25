<%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 6/22/20
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="init.jsp"%>

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    GuestBook guestBook = (GuestBook) row.getObject();
%>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editGuestBookURL">
        <portlet:param name="mvcPath" value="/edit_guestBook.jsp"/>
        <portlet:param name="guestBookId" value="<%=String.valueOf(guestBook.getGuestBookId())%>"/>
    </portlet:renderURL>

    <liferay-ui:icon image="edit" message="Edit" url="${editGuestBookURL}"/>

    <portlet:actionURL var="deleteGuestBookURL" name="deleteGuestBook">
        <portlet:param name="guestBookId" value="<%=String.valueOf(guestBook.getGuestBookId())%>"/>
    </portlet:actionURL>

    <liferay-ui:icon image="delete" message="Delete" url="${deleteGuestBookURL}"/>

    <c:if
            test="<%=GuestBookModelPermission.contains(permissionChecker, guestBook.getGuestBookId(), ActionKeys.PERMISSIONS) %>">

        <liferay-security:permissionsURL
                modelResource="<%= GuestBook.class.getName() %>"
                modelResourceDescription="<%= guestBook.getName() %>"
                resourcePrimKey="<%= String.valueOf(guestBook.getGuestBookId()) %>"
                var="permissionsURL" />

        <liferay-ui:icon image="permissions" url="${permissionsURL}" />

    </c:if>
</liferay-ui:icon-menu>