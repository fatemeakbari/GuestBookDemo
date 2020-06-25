package com.proliferay.myportlet.search;

import com.liferay.portal.kernel.search.Document;
import com.proliferay.myportlet.model.GuestBook;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;

@Component(
        immediate = true,
        property = "indexer.class.name=com.proliferay.myportlet.model.Guestbook",
        service = ModelDocumentContributor.class
)
public class GuestBookModelDocumentContributor implements ModelDocumentContributor<GuestBook>{
    @Override
    public void contribute(Document document, GuestBook baseModel) {

    }
}
