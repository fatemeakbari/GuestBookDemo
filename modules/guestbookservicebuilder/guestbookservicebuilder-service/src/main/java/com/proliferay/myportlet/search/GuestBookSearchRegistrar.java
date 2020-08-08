package com.proliferay.myportlet.search;


import com.proliferay.myportlet.model.GuestBook;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.search.Field;

import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.registrar.ModelSearchRegistrarHelper;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;


@Component(immediate = true)
public class GuestBookSearchRegistrar {

    @Activate
    protected void activate(BundleContext bundleContext) {

        _serviceRegistration = modelSearchRegistrarHelper.register(
                GuestBook.class, bundleContext, modelSearchDefinition -> {
                    modelSearchDefinition.setDefaultSelectedFieldNames(
                            Field.ASSET_TAG_NAMES, Field.COMPANY_ID, Field.CONTENT,
                            Field.ENTRY_CLASS_NAME, Field.ENTRY_CLASS_PK,
                             Field.MODIFIED_DATE,
                            Field.TITLE);

                    modelSearchDefinition.setModelIndexWriteContributor(
                            modelIndexWriterContributor);
                    modelSearchDefinition.setModelSummaryContributor(
                            modelSummaryContributor);
                });
    }

    @Deactivate
    protected void deactivate() {

        _serviceRegistration.unregister();
    }

    @Reference(target = "(indexer.class.name=com.proliferay.myportlet.model.GuestBook)")
    protected ModelIndexerWriterContributor<GuestBook> modelIndexWriterContributor;

    @Reference
    protected ModelSearchRegistrarHelper modelSearchRegistrarHelper;

    @Reference(target = "(indexer.class.name=com.proliferay.myportlet.model.GuestBook)")
    protected ModelSummaryContributor modelSummaryContributor;

    private ServiceRegistration<?> _serviceRegistration;
}
