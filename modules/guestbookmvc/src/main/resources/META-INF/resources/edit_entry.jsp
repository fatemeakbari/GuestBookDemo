<%--
  Created by IntelliJ IDEA.
  User: fateme
  Date: 6/12/20
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="init.jsp"%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:renderURL>



<portlet:actionURL name="addEntry" var="addEntryURL"/>
<%
  long entryId = ParamUtil.getLong(request,"entryId");
  long guestBookId = ParamUtil.getLong(request,"guestBookId");

  Entry entry = null;
  if(entryId > 0){
      entry = EntryLocalServiceUtil.getEntry(entryId);
  }
%>


<p2>Add Entry Form</p2><br />
<aui:form action="${addEntryURL}" method="post" name="<portlet:namespace />">
    <aui:model-context bean="<%= entry %>" model="<%= Entry.class %>" />
    <aui:fieldset>

        <aui:input name="name"/>
        <aui:input name="email"/>
        <aui:input name="message" type="text"/>
        <aui:input name="entryId" type="hidden" />
        <aui:input name="guestBookId" type="hidden" value='<%= entry == null ? guestBookId : entry.getGuestBookId() %>'/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" cssClass="btn btn-success"/>
        <aui:button type="cancel" onClick="${viewURL}" cssClass="btn btn-secondary"/>
    </aui:button-row>
</aui:form>
