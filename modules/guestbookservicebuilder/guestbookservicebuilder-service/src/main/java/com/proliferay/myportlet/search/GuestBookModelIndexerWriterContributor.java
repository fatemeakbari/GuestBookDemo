package com.proliferay.myportlet.search;

import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import com.proliferay.myportlet.model.GuestBook;
import com.proliferay.myportlet.service.GuestBookLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.search.Field;

import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
/**
 * Search and Indexing GuestBook
 *
 *
 *ModelIndexerWriterContributor configures the batch indexing behavior
 * for GuestBooks. This code is executed when GuestBooks are re-indexed
 * from the Search administration section of the Control Panel.
 *
 ***/
@Component(
        immediate = true,
        property = "indexer.class.name=com.proliferay.myportlet.model.GuestBook",
        service = ModelIndexerWriterContributor.class
)
public class GuestBookModelIndexerWriterContributor
        implements ModelIndexerWriterContributor<GuestBook> {

    @Override
    public void customize(
            BatchIndexingActionable batchIndexingActionable,
            ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {

        batchIndexingActionable.setPerformActionMethod((GuestBook guestBook) -> {
            Document document = modelIndexerWriterDocumentHelper.getDocument(
                    guestBook);

            batchIndexingActionable.addDocuments(document);
        });
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(
                guestBookLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public long getCompanyId(GuestBook guestBook) {
        return guestBook.getCompanyId();
    }

    @Override
    public void modelIndexed(GuestBook guestBook) {
        entryBatchReindexer.reindex(
                guestBook.getGuestBookId(), guestBook.getCompanyId());
    }

    @Reference
    protected DynamicQueryBatchIndexingActionableFactory
            dynamicQueryBatchIndexingActionableFactory;

    @Reference
    protected EntryBatchReindexer entryBatchReindexer;

    @Reference
    protected GuestBookLocalService guestBookLocalService;

}
