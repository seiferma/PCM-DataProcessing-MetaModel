package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import org.eclipse.emf.common.notify.Adapter;

public class ProcessingItemProviderAdapterFactory extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.ProcessingItemProviderAdapterFactory {

	@Override
	public Adapter createDataProcessingContainerAdapter() {
		if (dataProcessingContainerItemProvider == null) {
			dataProcessingContainerItemProvider = new DataProcessingContainerItemProvider(this);
		}
		return dataProcessingContainerItemProvider;
	}

	@Override
	public Adapter createDataParameterMappingAdapter() {
		if (dataParameterMappingItemProvider == null) {
			dataParameterMappingItemProvider = new DataParameterMappingItemProvider(this);
		}
		return dataParameterMappingItemProvider;
	}

	@Override
	public Adapter createDataResultMappingAdapter() {
		if (dataResultMappingItemProvider == null) {
			dataResultMappingItemProvider = new DataResultMappingItemProvider(this);
		}
		return dataResultMappingItemProvider;
	}

	@Override
	public Adapter createSelectionDataOperationAdapter() {
		if (selectionDataOperationItemProvider == null) {
			selectionDataOperationItemProvider = new SelectionDataOperationItemProvider(this);
		}
		return selectionDataOperationItemProvider;
	}

	@Override
	public Adapter createCreateDataOperationAdapter() {
		if (createDataOperationItemProvider == null) {
			createDataOperationItemProvider = new CreateDataOperationItemProvider(this);
		}
		return createDataOperationItemProvider;
	}

	@Override
	public Adapter createPerformDataTransmissionOperationAdapter() {
		if (performDataTransmissionOperationItemProvider == null) {
			performDataTransmissionOperationItemProvider = new PerformDataTransmissionOperationItemProvider(this);
		}
		return performDataTransmissionOperationItemProvider;
	}

	@Override
	public Adapter createReturnDataOperationAdapter() {
		if (returnDataOperationItemProvider == null) {
			returnDataOperationItemProvider = new ReturnDataOperationItemProvider(this);
		}
		return returnDataOperationItemProvider;
	}

}
