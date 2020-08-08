package com.proliferay.myportlet.search;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import com.proliferay.myportlet.model.Entry;
import com.proliferay.myportlet.model.GuestBook;
import com.proliferay.myportlet.service.GuestBookLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Locale;

@Component(
        immediate = true,
        property = "indexer.class.name=com.proliferay.myportlet.model.Entry",
        service = ModelDocumentContributor.class
)
public class EntryModelDocumentContributor
        implements ModelDocumentContributor<Entry> {

    @Override
    public void contribute(Document document, Entry entry) {
        try {
            Locale defaultLocale = PortalUtil.getSiteDefaultLocale(
                    entry.getGroupId());

            document.addDate(Field.MODIFIED_DATE, entry.getModifiedDate());
            document.addText("entryEmail", entry.getEmail());

            String localizedTitle = LocalizationUtil.getLocalizedName(
                    Field.TITLE, defaultLocale.toString());
            String localizedContent = LocalizationUtil.getLocalizedName(
                    Field.CONTENT, defaultLocale.toString());

            document.addText(localizedTitle, entry.getName());
            document.addText(localizedContent, entry.getMessage());

            long guestBookId = entry.getGuestBookId();

            GuestBook guestBook = _guestBookLocalService.getGuestBook(
                    guestBookId);

            String guestBookName = guestBook.getName();

            String localizedGbName = LocalizationUtil.getLocalizedName(
                    Field.NAME, defaultLocale.toString());

            document.addText(localizedGbName, guestBookName);

            _log.info("index new entry  "+entry.getEntryId());

        } catch (PortalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to index entry " + entry.getEntryId(), pe);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final Log _log = LogFactoryUtil.getLog(
            EntryModelDocumentContributor.class);

    @Reference
    private GuestBookLocalService _guestBookLocalService;
}
