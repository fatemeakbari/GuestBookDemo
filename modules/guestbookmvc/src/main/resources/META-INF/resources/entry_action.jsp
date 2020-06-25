<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 6/22/20
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="init.jsp"%>
<%

    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

    Entry entry = (Entry)row.getObject();
%>

<%--<liferay-ui:icon-menu>--%>

<%--    <portlet:renderURL var="editURL">--%>
<%--        <portlet:param name="entryId"--%>
<%--                       value="<%= String.valueOf(entry.getEntryId()) %>" />--%>
<%--        <portlet:param name="mvcPath" value="/edit_entry.jsp" />--%>
<%--    </portlet:renderURL>--%>

<%--    <liferay-ui:icon image="edit" message="Edit"--%>
<%--                     url="${editURL}" />--%>

<%--    <portlet:actionURL name="deleteEntry" var="deleteURL">--%>
<%--        <portlet:param name="entryId"--%>
<%--                       value="<%= String.valueOf(entry.getEntryId()) %>" />--%>
<%--        <portlet:param name="guestBookId"--%>
<%--                       value="<%= String.valueOf(entry.getGuestBookId()) %>" />--%>
<%--    </portlet:actionURL>--%>

<%--    <liferay-ui:icon-delete image="delete" message="Delete" url="${deleteURL}" />--%>

<%--</liferay-ui:icon-menu>--%>






<liferay-ui:icon-menu>

    <c:if
            test="<%=EntryModelPermission.contains(permissionChecker,entry.getEntryId(),ActionKeys.UPDATE)%>">
        <portlet:renderURL var="editURL">
            <portlet:param name="entryId"
                           value="<%= String.valueOf(entry.getEntryId()) %>" />
            <portlet:param name="mvcPath" value="/edit_entry.jsp" />
        </portlet:renderURL>

        <liferay-ui:icon image="edit" message="Edit"
                         url="${editURL}" />
    </c:if>

    <c:if
            test="<%=EntryModelPermission.contains(permissionChecker,entry.getEntryId(),ActionKeys.PERMISSIONS)%>">

        <liferay-security:permissionsURL
                modelResource="<%=Entry.class.getName() %>"
                modelResourceDescription="<%= entry.getMessage() %>"
                resourcePrimKey="<%= String.valueOf(entry.getEntryId()) %>"
                var="permissionsURL" />

        <liferay-ui:icon image="permissions" url="${ permissionsURL}" />

    </c:if>

    <c:if
            test="<%=EntryModelPermission.contains(permissionChecker,entry.getEntryId(),ActionKeys.DELETE)%>">

        <portlet:actionURL name="deleteEntry" var="deleteURL">
            <portlet:param name="entryId"
                           value="<%= String.valueOf(entry.getEntryId()) %>" />
            <portlet:param name="guestBookId"
                           value="<%= String.valueOf(entry.getGuestBookId()) %>" />
        </portlet:actionURL>

        <liferay-ui:icon-delete image="delete" url="${deleteURL.toString()}" />
    </c:if>

</liferay-ui:icon-menu>