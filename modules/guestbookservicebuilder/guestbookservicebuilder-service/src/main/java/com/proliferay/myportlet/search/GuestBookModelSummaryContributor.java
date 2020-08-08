package com.proliferay.myportlet.search;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;


@Component(
        immediate = true,
        property = "indexer.class.name=com.proliferay.myportlet.model.GuestBook",
        service = ModelSummaryContributor.class
)
public class GuestBookModelSummaryContributor implements ModelSummaryContributor {
    @Override
    public Summary getSummary(Document document, Locale locale, String snippet) {

        Summary summary = createSummary(document);

        summary.setMaxContentLength(200);

        return summary;
    }

    private Summary createSummary(Document document) {
        String prefix = Field.SNIPPET + StringPool.UNDERLINE;

        String title = document.get(prefix + Field.TITLE, Field.TITLE);

        _log.info("guestbook summary title "+ title);
        return new Summary(title, StringPool.BLANK);
    }

    private static final Log _log = LogFactoryUtil.getLog(
            GuestBookModelSummaryContributor.class);
}
