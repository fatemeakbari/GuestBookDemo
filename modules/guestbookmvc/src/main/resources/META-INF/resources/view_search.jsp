<%--<%@ page import="com.liferay.portal.kernel.search.*" %>--%>
<%--<%@ page import="com.liferay.portal.kernel.util.*" %>--%>
<%--<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>--%>
<%--<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>--%>
<%--<%@ page import="jdk.nashorn.internal.runtime.ErrorManager" %>--%>

<%--<%@ page import="java.util.*" %>--%>
<%--<%@ page import="com.proliferay.myportlet.model.EntryModel" %>--%>
<%--<%@ page import="com.liferay.portal.kernel.log.LogFactoryUtil" %>--%>
<%--<%@ page import="com.liferay.portal.kernel.log.Log" %>&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: fateme--%>
<%--  Date: 6/25/20--%>
<%--  Time: 5:56 PM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%@ include file="init.jsp"%>

<%
    long guestBookId = ParamUtil.getLong(request,"guestBookId");
    String keywords = ParamUtil.getString(request,"keywords");
%>

<portlet:renderURL var="searchURL">
    <portlet:param name="mvcPath" value="/view_search.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/view.jsp"/>o
</portlet:renderURL>

<aui:form action="${searchURL}">
    <div class="row">
        <div class="col-md-8">
            <aui:input name="keywords" inlineLabel="left" size="192" placeholder="search-entries" label=""/>
        </div>
        <div class="col-md-8">
            <aui:button type="submit" value="search"/>
        </div>
    </div>
</aui:form>

<%!
    private static Log _log = LogFactoryUtil.getLog("html.view_search_jsp");
%>

<%
    SearchContext searchContext = SearchContextFactory.getInstance(request);
    searchContext.setKeywords(keywords);
    searchContext.setAttribute("paginationType", "more");
    searchContext.setStart(0);
    searchContext.setEnd(10);

    Indexer<Entry> indexer = IndexerRegistryUtil.getIndexer(Entry.class);


    Hits hits = indexer.search(searchContext);

    List<Entry> entries = new ArrayList<Entry>();

    for (int i = 0; i < hits.getDocs().length; i++) {
        Document doc = hits.doc(i);

        long entryId = GetterUtil
                .getLong(doc.get(Field.ENTRY_CLASS_PK));

        Entry entry = null;


        try {
            entry = EntryLocalServiceUtil.getEntry(entryId);
        } catch (PortalException pe) {
            _log.error(pe.getLocalizedMessage());
        } catch (SystemException se) {
            _log.error(se.getLocalizedMessage());
        }

        entries.add(entry);
    }

    List<GuestBook> guestBooks = GuestBookLocalServiceUtil.getGuestBooks(scopeGroupId);

    Map<String, String> guestBookMap = new HashMap<String, String>();

    for (GuestBook guestBook : guestBooks) {
        guestBookMap.put(Long.toString(guestBook.getGuestBookId()), guestBook.getName());
    }
%>


<liferay-ui:search-container delta="10"
                             emptyResultsMessage="no-entries-were-found">
    <liferay-ui:search-container-results
            results="<%= entries %>"
    />

    <liferay-ui:search-container-row
            className="com.proliferay.myportlet.model.Entry"
            keyProperty="entryId" escapedModel="<%=true%>" modelVar="entrty">



        <liferay-ui:search-container-column-text property="message" />
        <liferay-ui:search-container-column-text property="name" />

        <liferay-ui:search-container-column-jsp
                path="/entry_action.jsp"
                align="right" />
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

