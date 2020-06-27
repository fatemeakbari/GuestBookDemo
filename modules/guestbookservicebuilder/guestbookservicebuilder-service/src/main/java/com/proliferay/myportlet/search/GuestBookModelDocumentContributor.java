package com.proliferay.myportlet.search;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import com.proliferay.myportlet.model.GuestBook;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;

/**
 * Search and Indexing GuestBook
 * Implement a ModelDocumentContributor that “contributes” fields to a
 * search document indexed by the search engine. The main searchable field
 * for guestbooks is the guestbook name.
 * **/
@Component(
        immediate = true,
        property = "indexer.class.name=com.proliferay.myportlet.model.GuestBook",
        service = ModelDocumentContributor.class
)
public class GuestBookModelDocumentContributor
        implements ModelDocumentContributor<GuestBook> {

    @Override
    public void contribute(Document document, GuestBook guestBook) {
        try {
            document.addDate(Field.MODIFIED_DATE, guestBook.getModifiedDate());

            Locale defaultLocale = PortalUtil.getSiteDefaultLocale(
                    guestBook.getGroupId());

            String localizedTitle = LocalizationUtil.getLocalizedName(
                    Field.TITLE, defaultLocale.toString());

            document.addText(localizedTitle, guestBook.getName());
        } catch (PortalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn(
                        "Unable to index guestBook " + guestBook.getGuestBookId(), pe);
            }
        }
    }

    private static final Log _log = LogFactoryUtil.getLog(
            GuestBookModelDocumentContributor.class);

}