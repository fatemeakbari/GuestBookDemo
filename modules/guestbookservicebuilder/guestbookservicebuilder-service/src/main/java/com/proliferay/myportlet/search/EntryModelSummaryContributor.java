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
        property = "indexer.class.name=com.proliferay.myportlet.model.Entry",
        service = ModelSummaryContributor.class
)
public class EntryModelSummaryContributor implements ModelSummaryContributor {

    @Override
    public Summary getSummary(
            Document document, Locale locale, String snippet) {

        Summary summary = createSummary(document);

        summary.setMaxContentLength(128);

        return summary;
    }

    private Summary createSummary(Document document) {
        String prefix = Field.SNIPPET + StringPool.UNDERLINE;

        String title = document.get(prefix + Field.TITLE, Field.CONTENT);
        String content = document.get(prefix + Field.CONTENT, Field.CONTENT);

        _log.info("entry summary title "+title);
        _log.info("entry summary content "+content);
        return new Summary(title, content);
    }

    private static final Log _log = LogFactoryUtil.getLog(
            EntryModelSummaryContributor.class);

}
