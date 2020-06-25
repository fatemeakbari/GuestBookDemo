package com.proliferay.myportlet.search;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;

import com.liferay.portal.search.indexer.IndexerDocumentBuilder;
import com.liferay.portal.search.indexer.IndexerWriter;
import com.proliferay.myportlet.model.Entry;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.Property;

@Component(immediate = true, service = EntryBatchReindexer.class)
public class EntryBatchReindexerImpl implements EntryBatchReindexer {

    @Override
    public void reindex(long guestBookId, long companyId) {
        BatchIndexingActionable batchIndexingActionable =
                indexerWriter.getBatchIndexingActionable();

        batchIndexingActionable.setAddCriteriaMethod(dynamicQuery -> {
            Property guestBookIdPropery = PropertyFactoryUtil.forName(
                    "guestBookId");

            dynamicQuery.add(guestBookIdPropery.eq(guestBookId));
        });

        batchIndexingActionable.setCompanyId(companyId);

        batchIndexingActionable.setPerformActionMethod((Entry entry) -> {
            Document document = indexerDocumentBuilder.getDocument(entry);

            batchIndexingActionable.addDocuments(document);
        });

        batchIndexingActionable.performActions();

    }

    @Reference(target = "(indexer.class.name=com.proliferay.myportlet.model.Entry)")
    protected IndexerDocumentBuilder indexerDocumentBuilder;

    @Reference(target = "(indexer.class.name=com.proliferay.myportlet.model.Entry)")
    protected IndexerWriter<Entry> indexerWriter;

}