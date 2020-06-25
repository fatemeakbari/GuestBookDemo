package com.proliferay.myportlet.search;

import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.search.query.QueryHelper;
import com.liferay.portal.search.spi.model.query.contributor.KeywordQueryContributor;
import com.liferay.portal.search.spi.model.query.contributor.helper.KeywordQueryContributorHelper;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


/**
*
* Search and Indexing GuestBook
* This class adds GuestBook fields to the search query constructed 
* by the Search application in Liferay DXP. Later, when you asset-enable 
* GuestBooks, this code allows indexed GuestBooks to be searched from the Search 
* application when a keyword is entered into the search bar. Use the query helper 
* to add search terms to the query that allow GuestBooks to be found. 
* Here it’s important to note that adding the localized search term is important.
*  Since the localized GuestBook title was indexed,
*  you must retrieve the localized value from the search engine.**/
@Component(
        immediate = true,
        property = "indexer.class.name=com.proliferay.myportlet.model.GuestBook",
        service = KeywordQueryContributor.class
)
public class GuestBookKeywordQueryContributor
        implements KeywordQueryContributor {

    @Override
    public void contribute(
            String keywords, BooleanQuery booleanQuery,
            KeywordQueryContributorHelper keywordQueryContributorHelper) {

        SearchContext searchContext =
                keywordQueryContributorHelper.getSearchContext();

        queryHelper.addSearchLocalizedTerm(
                booleanQuery, searchContext, Field.TITLE, false);
    }

    @Reference
    protected QueryHelper queryHelper;

}
