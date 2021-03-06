/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.DataSEFFSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getDataProcessingContainers <em>Data Processing Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getCharacteristicTypeContainers <em>Characteristic Type Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getDataSEFFSpecifications <em>Data SEFF Specifications</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getStoreContainers <em>Store Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getCharacteristicContainer <em>Characteristic Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getRelatedCharacteristics <em>Related Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSpecificationImpl extends CDOObjectImpl implements DataSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSpecificationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DataprocessingPackage.Literals.DATA_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataProcessingContainer> getDataProcessingContainers()
	{
		return (EList<DataProcessingContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__DATA_PROCESSING_CONTAINERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacteristicTypeContainer> getCharacteristicTypeContainers()
	{
		return (EList<CharacteristicTypeContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_TYPE_CONTAINERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataSEFFSpecification> getDataSEFFSpecifications()
	{
		return (EList<DataSEFFSpecification>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__DATA_SEFF_SPECIFICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StoreContainer> getStoreContainers()
	{
		return (EList<StoreContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__STORE_CONTAINERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacteristicContainer> getCharacteristicContainer()
	{
		return (EList<CharacteristicContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RelatedCharacteristics> getRelatedCharacteristics()
	{
		return (EList<RelatedCharacteristics>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__RELATED_CHARACTERISTICS, true);
	}

} //DataSpecificationImpl
