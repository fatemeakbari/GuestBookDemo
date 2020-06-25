<%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 6/22/20
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="init.jsp"%>
<liferay-ui:success key="guestBookAdded" message="guestBook-added"/>
<liferay-ui:success key="guestBookUpdated" message="guestBook-updated"/>
<liferay-ui:success key="guestBookDeleted" message="guestBook-deleted"/>

<portlet:renderURL var="addGuestBookURL">
    <portlet:param name="mvcPath" value="/edit_guestBook.jsp"/>
</portlet:renderURL>

<aui:button-row>
    <aui:button value="Add GuestBook" onClick="${addGuestBookURL}" cssClass="btn btn-primary"/>
</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results results="<%=GuestBookLocalServiceUtil.getGuestBooks(scopeGroupId)%>"/>
    <liferay-ui:search-container-row className="com.proliferay.myportlet.model.GuestBook" modelVar="guestBook">
        <liferay-ui:search-container-column-text property="name"/>
        <liferay-ui:search-container-column-jsp path="/guestBook_action.jsp"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>
