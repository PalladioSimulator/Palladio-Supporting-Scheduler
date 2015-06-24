/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fzi.se.quality.qualityannotation.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.fzi.se.quality.qualityannotation.util.QualityAnnotationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class QualityAnnotationItemProviderAdapterFactory extends QualityAnnotationAdapterFactory
        implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {

    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QualityAnnotationItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.ParameterValueDeviation} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ParameterValueDeviationItemProvider parameterValueDeviationItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.ParameterValueDeviation}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createParameterValueDeviationAdapter() {
        if (this.parameterValueDeviationItemProvider == null) {
            this.parameterValueDeviationItemProvider = new ParameterValueDeviationItemProvider(this);
        }

        return this.parameterValueDeviationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.QualityAnnotation} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected QualityAnnotationItemProvider qualityAnnotationItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.QualityAnnotation}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createQualityAnnotationAdapter() {
        if (this.qualityAnnotationItemProvider == null) {
            this.qualityAnnotationItemProvider = new QualityAnnotationItemProvider(this);
        }

        return this.qualityAnnotationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.RequiredElementDeviation} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RequiredElementDeviationItemProvider requiredElementDeviationItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.RequiredElementDeviation}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createRequiredElementDeviationAdapter() {
        if (this.requiredElementDeviationItemProvider == null) {
            this.requiredElementDeviationItemProvider = new RequiredElementDeviationItemProvider(this);
        }

        return this.requiredElementDeviationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InternalStateInfluenceAnalysisAggregationItemProvider internalStateInfluenceAnalysisAggregationItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createInternalStateInfluenceAnalysisAggregationAdapter() {
        if (this.internalStateInfluenceAnalysisAggregationItemProvider == null) {
            this.internalStateInfluenceAnalysisAggregationItemProvider = new InternalStateInfluenceAnalysisAggregationItemProvider(
                    this);
        }

        return this.internalStateInfluenceAnalysisAggregationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.REPrecision} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected REPrecisionItemProvider rePrecisionItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.REPrecision}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createREPrecisionAdapter() {
        if (this.rePrecisionItemProvider == null) {
            this.rePrecisionItemProvider = new REPrecisionItemProvider(this);
        }

        return this.rePrecisionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMParameterPartition} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMParameterPartitionItemProvider pcmParameterPartitionItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.PCMParameterPartition}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMParameterPartitionAdapter() {
        if (this.pcmParameterPartitionItemProvider == null) {
            this.pcmParameterPartitionItemProvider = new PCMParameterPartitionItemProvider(this);
        }

        return this.pcmParameterPartitionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CharacterisedPCMParameterPartitionIntervalItemProvider characterisedPCMParameterPartitionIntervalItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCharacterisedPCMParameterPartitionIntervalAdapter() {
        if (this.characterisedPCMParameterPartitionIntervalItemProvider == null) {
            this.characterisedPCMParameterPartitionIntervalItemProvider = new CharacterisedPCMParameterPartitionIntervalItemProvider(
                    this);
        }

        return this.characterisedPCMParameterPartitionIntervalItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionRange}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CharacterisedPCMParameterPartitionRangeItemProvider characterisedPCMParameterPartitionRangeItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.CharacterisedPCMParameterPartitionRange}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCharacterisedPCMParameterPartitionRangeAdapter() {
        if (this.characterisedPCMParameterPartitionRangeItemProvider == null) {
            this.characterisedPCMParameterPartitionRangeItemProvider = new CharacterisedPCMParameterPartitionRangeItemProvider(
                    this);
        }

        return this.characterisedPCMParameterPartitionRangeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.ExactlyAsSpecifiedPrecision} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExactlyAsSpecifiedPrecisionItemProvider exactlyAsSpecifiedPrecisionItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.ExactlyAsSpecifiedPrecision}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createExactlyAsSpecifiedPrecisionAdapter() {
        if (this.exactlyAsSpecifiedPrecisionItemProvider == null) {
            this.exactlyAsSpecifiedPrecisionItemProvider = new ExactlyAsSpecifiedPrecisionItemProvider(this);
        }

        return this.exactlyAsSpecifiedPrecisionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.LimitedDeviationPrecision} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected LimitedDeviationPrecisionItemProvider limitedDeviationPrecisionItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.LimitedDeviationPrecision}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createLimitedDeviationPrecisionAdapter() {
        if (this.limitedDeviationPrecisionItemProvider == null) {
            this.limitedDeviationPrecisionItemProvider = new LimitedDeviationPrecisionItemProvider(this);
        }

        return this.limitedDeviationPrecisionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.NoPrecision} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected NoPrecisionItemProvider noPrecisionItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.NoPrecision}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createNoPrecisionAdapter() {
        if (this.noPrecisionItemProvider == null) {
            this.noPrecisionItemProvider = new NoPrecisionItemProvider(this);
        }

        return this.noPrecisionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMRECategory} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMRECategoryItemProvider pcmreCategoryItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMRECategory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMRECategoryAdapter() {
        if (this.pcmreCategoryItemProvider == null) {
            this.pcmreCategoryItemProvider = new PCMRECategoryItemProvider(this);
        }

        return this.pcmreCategoryItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMREInterface} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMREInterfaceItemProvider pcmreInterfaceItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMREInterface}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMREInterfaceAdapter() {
        if (this.pcmreInterfaceItemProvider == null) {
            this.pcmreInterfaceItemProvider = new PCMREInterfaceItemProvider(this);
        }

        return this.pcmreInterfaceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMRERole} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected PCMRERoleItemProvider pcmreRoleItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMRERole}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMRERoleAdapter() {
        if (this.pcmreRoleItemProvider == null) {
            this.pcmreRoleItemProvider = new PCMRERoleItemProvider(this);
        }

        return this.pcmreRoleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMRESignature} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMRESignatureItemProvider pcmreSignatureItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMRESignature}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMRESignatureAdapter() {
        if (this.pcmreSignatureItemProvider == null) {
            this.pcmreSignatureItemProvider = new PCMRESignatureItemProvider(this);
        }

        return this.pcmreSignatureItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMServiceSpecification} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMServiceSpecificationItemProvider pcmServiceSpecificationItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.PCMServiceSpecification}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMServiceSpecificationAdapter() {
        if (this.pcmServiceSpecificationItemProvider == null) {
            this.pcmServiceSpecificationItemProvider = new PCMServiceSpecificationItemProvider(this);
        }

        return this.pcmServiceSpecificationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMREResourceInterface} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMREResourceInterfaceItemProvider pcmreResourceInterfaceItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.PCMREResourceInterface}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMREResourceInterfaceAdapter() {
        if (this.pcmreResourceInterfaceItemProvider == null) {
            this.pcmreResourceInterfaceItemProvider = new PCMREResourceInterfaceItemProvider(this);
        }

        return this.pcmreResourceInterfaceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMREResourceSignature} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMREResourceSignatureItemProvider pcmreResourceSignatureItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.PCMREResourceSignature}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMREResourceSignatureAdapter() {
        if (this.pcmreResourceSignatureItemProvider == null) {
            this.pcmreResourceSignatureItemProvider = new PCMREResourceSignatureItemProvider(this);
        }

        return this.pcmreResourceSignatureItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMREResource} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMREResourceItemProvider pcmreResourceItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMREResource}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMREResourceAdapter() {
        if (this.pcmreResourceItemProvider == null) {
            this.pcmreResourceItemProvider = new PCMREResourceItemProvider(this);
        }

        return this.pcmreResourceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMREResourceRole} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMREResourceRoleItemProvider pcmreResourceRoleItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMREResourceRole}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMREResourceRoleAdapter() {
        if (this.pcmreResourceRoleItemProvider == null) {
            this.pcmreResourceRoleItemProvider = new PCMREResourceRoleItemProvider(this);
        }

        return this.pcmreResourceRoleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMRECIBehavior} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMRECIBehaviorItemProvider pcmreciBehaviorItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMRECIBehavior}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMRECIBehaviorAdapter() {
        if (this.pcmreciBehaviorItemProvider == null) {
            this.pcmreciBehaviorItemProvider = new PCMRECIBehaviorItemProvider(this);
        }

        return this.pcmreciBehaviorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMREInfrastructureInterface} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMREInfrastructureInterfaceItemProvider pcmreInfrastructureInterfaceItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.PCMREInfrastructureInterface}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMREInfrastructureInterfaceAdapter() {
        if (this.pcmreInfrastructureInterfaceItemProvider == null) {
            this.pcmreInfrastructureInterfaceItemProvider = new PCMREInfrastructureInterfaceItemProvider(this);
        }

        return this.pcmreInfrastructureInterfaceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMREInfrastructureRole} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMREInfrastructureRoleItemProvider pcmreInfrastructureRoleItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.PCMREInfrastructureRole}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMREInfrastructureRoleAdapter() {
        if (this.pcmreInfrastructureRoleItemProvider == null) {
            this.pcmreInfrastructureRoleItemProvider = new PCMREInfrastructureRoleItemProvider(this);
        }

        return this.pcmreInfrastructureRoleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMREInfrastructureSignature} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMREInfrastructureSignatureItemProvider pcmreInfrastructureSignatureItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.fzi.se.quality.qualityannotation.PCMREInfrastructureSignature}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMREInfrastructureSignatureAdapter() {
        if (this.pcmreInfrastructureSignatureItemProvider == null) {
            this.pcmreInfrastructureSignatureItemProvider = new PCMREInfrastructureSignatureItemProvider(this);
        }

        return this.pcmreInfrastructureSignatureItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMPEAllDecisions} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMPEAllDecisionsItemProvider pcmpeAllDecisionsItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMPEAllDecisions}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMPEAllDecisionsAdapter() {
        if (this.pcmpeAllDecisionsItemProvider == null) {
            this.pcmpeAllDecisionsItemProvider = new PCMPEAllDecisionsItemProvider(this);
        }

        return this.pcmpeAllDecisionsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.fzi.se.quality.qualityannotation.PCMPEDecision} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMPEDecisionItemProvider pcmpeDecisionItemProvider;

    /**
     * This creates an adapter for a {@link de.fzi.se.quality.qualityannotation.PCMPEDecision}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMPEDecisionAdapter() {
        if (this.pcmpeDecisionItemProvider == null) {
            this.pcmpeDecisionItemProvider = new PCMPEDecisionItemProvider(this);
        }

        return this.pcmpeDecisionItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (this.isFactoryForType(type)) {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null) {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (this.parameterValueDeviationItemProvider != null) {
            this.parameterValueDeviationItemProvider.dispose();
        }
        if (this.qualityAnnotationItemProvider != null) {
            this.qualityAnnotationItemProvider.dispose();
        }
        if (this.requiredElementDeviationItemProvider != null) {
            this.requiredElementDeviationItemProvider.dispose();
        }
        if (this.internalStateInfluenceAnalysisAggregationItemProvider != null) {
            this.internalStateInfluenceAnalysisAggregationItemProvider.dispose();
        }
        if (this.rePrecisionItemProvider != null) {
            this.rePrecisionItemProvider.dispose();
        }
        if (this.pcmParameterPartitionItemProvider != null) {
            this.pcmParameterPartitionItemProvider.dispose();
        }
        if (this.characterisedPCMParameterPartitionIntervalItemProvider != null) {
            this.characterisedPCMParameterPartitionIntervalItemProvider.dispose();
        }
        if (this.characterisedPCMParameterPartitionRangeItemProvider != null) {
            this.characterisedPCMParameterPartitionRangeItemProvider.dispose();
        }
        if (this.exactlyAsSpecifiedPrecisionItemProvider != null) {
            this.exactlyAsSpecifiedPrecisionItemProvider.dispose();
        }
        if (this.limitedDeviationPrecisionItemProvider != null) {
            this.limitedDeviationPrecisionItemProvider.dispose();
        }
        if (this.noPrecisionItemProvider != null) {
            this.noPrecisionItemProvider.dispose();
        }
        if (this.pcmreCategoryItemProvider != null) {
            this.pcmreCategoryItemProvider.dispose();
        }
        if (this.pcmreInterfaceItemProvider != null) {
            this.pcmreInterfaceItemProvider.dispose();
        }
        if (this.pcmreRoleItemProvider != null) {
            this.pcmreRoleItemProvider.dispose();
        }
        if (this.pcmreSignatureItemProvider != null) {
            this.pcmreSignatureItemProvider.dispose();
        }
        if (this.pcmServiceSpecificationItemProvider != null) {
            this.pcmServiceSpecificationItemProvider.dispose();
        }
        if (this.pcmreResourceInterfaceItemProvider != null) {
            this.pcmreResourceInterfaceItemProvider.dispose();
        }
        if (this.pcmreResourceSignatureItemProvider != null) {
            this.pcmreResourceSignatureItemProvider.dispose();
        }
        if (this.pcmreResourceItemProvider != null) {
            this.pcmreResourceItemProvider.dispose();
        }
        if (this.pcmreResourceRoleItemProvider != null) {
            this.pcmreResourceRoleItemProvider.dispose();
        }
        if (this.pcmreciBehaviorItemProvider != null) {
            this.pcmreciBehaviorItemProvider.dispose();
        }
        if (this.pcmreInfrastructureInterfaceItemProvider != null) {
            this.pcmreInfrastructureInterfaceItemProvider.dispose();
        }
        if (this.pcmreInfrastructureRoleItemProvider != null) {
            this.pcmreInfrastructureRoleItemProvider.dispose();
        }
        if (this.pcmreInfrastructureSignatureItemProvider != null) {
            this.pcmreInfrastructureSignatureItemProvider.dispose();
        }
        if (this.pcmpeAllDecisionsItemProvider != null) {
            this.pcmpeAllDecisionsItemProvider.dispose();
        }
        if (this.pcmpeDecisionItemProvider != null) {
            this.pcmpeDecisionItemProvider.dispose();
        }
    }

}
