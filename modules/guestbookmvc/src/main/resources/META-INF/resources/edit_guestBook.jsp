<%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 6/22/20
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="init.jsp" %>

<%
    long guestBookId = ParamUtil.getLong(request,"guestBookId");
    GuestBook guestBook = null;
    if(guestBookId > 0){
        guestBook = GuestBookLocalServiceUtil.getGuestBook(guestBookId);
    }
%>


<portlet:renderURL var="adminViewURL">
    <portlet:param name="mvcPath" value="/admin_view.jsp"/>
</portlet:renderURL>
<portlet:actionURL var="editGuestBookURL" name="<%=guestBook==null? "addGuestBook" : "updateGuestBook"%>" />



<aui:form action="${editGuestBookURL}" method="post">
    <aui:model-context model="<%=GuestBook.class%>" bean="<%=guestBook%>"/>
    <aui:fieldset>
        <aui:input name="name"/>
        <aui:input name="guestBookId" type="hidden" value="<%=guestBookId%>"/>
    </aui:fieldset>
    <aui:button-row>
        <aui:button type="submit" cssClass="btn btn-success"/>
        <aui:button  type="cancel" cssClass="btn btn-secondary" onClick="${adminViewURL}"/>
    </aui:button-row>
</aui:form>