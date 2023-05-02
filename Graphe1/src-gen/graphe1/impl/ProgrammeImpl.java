/**
 */
package graphe1.impl;

import graphe1.Colonne;
import graphe1.Donner;
import graphe1.Graphe;
import graphe1.Graphe1Package;
import graphe1.Programme;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphe1.impl.ProgrammeImpl#getGraphe <em>Graphe</em>}</li>
 *   <li>{@link graphe1.impl.ProgrammeImpl#getColonne <em>Colonne</em>}</li>
 *   <li>{@link graphe1.impl.ProgrammeImpl#getDonner <em>Donner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends NameImpl implements Programme {
	/**
	 * The cached value of the '{@link #getGraphe() <em>Graphe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphe()
	 * @generated
	 * @ordered
	 */
	protected EList<Graphe> graphe;

	/**
	 * The cached value of the '{@link #getColonne() <em>Colonne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonne()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonne;

	/**
	 * The cached value of the '{@link #getDonner() <em>Donner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonner()
	 * @generated
	 * @ordered
	 */
	protected EList<Donner> donner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphe1Package.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Graphe> getGraphe() {
		if (graphe == null) {
			graphe = new EObjectContainmentEList<Graphe>(Graphe.class, this, Graphe1Package.PROGRAMME__GRAPHE);
		}
		return graphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Colonne> getColonne() {
		if (colonne == null) {
			colonne = new EObjectContainmentEList<Colonne>(Colonne.class, this, Graphe1Package.PROGRAMME__COLONNE);
		}
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Donner> getDonner() {
		if (donner == null) {
			donner = new EObjectContainmentEList<Donner>(Donner.class, this, Graphe1Package.PROGRAMME__DONNER);
		}
		return donner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graphe1Package.PROGRAMME__GRAPHE:
			return ((InternalEList<?>) getGraphe()).basicRemove(otherEnd, msgs);
		case Graphe1Package.PROGRAMME__COLONNE:
			return ((InternalEList<?>) getColonne()).basicRemove(otherEnd, msgs);
		case Graphe1Package.PROGRAMME__DONNER:
			return ((InternalEList<?>) getDonner()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Graphe1Package.PROGRAMME__GRAPHE:
			return getGraphe();
		case Graphe1Package.PROGRAMME__COLONNE:
			return getColonne();
		case Graphe1Package.PROGRAMME__DONNER:
			return getDonner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Graphe1Package.PROGRAMME__GRAPHE:
			getGraphe().clear();
			getGraphe().addAll((Collection<? extends Graphe>) newValue);
			return;
		case Graphe1Package.PROGRAMME__COLONNE:
			getColonne().clear();
			getColonne().addAll((Collection<? extends Colonne>) newValue);
			return;
		case Graphe1Package.PROGRAMME__DONNER:
			getDonner().clear();
			getDonner().addAll((Collection<? extends Donner>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Graphe1Package.PROGRAMME__GRAPHE:
			getGraphe().clear();
			return;
		case Graphe1Package.PROGRAMME__COLONNE:
			getColonne().clear();
			return;
		case Graphe1Package.PROGRAMME__DONNER:
			getDonner().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Graphe1Package.PROGRAMME__GRAPHE:
			return graphe != null && !graphe.isEmpty();
		case Graphe1Package.PROGRAMME__COLONNE:
			return colonne != null && !colonne.isEmpty();
		case Graphe1Package.PROGRAMME__DONNER:
			return donner != null && !donner.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgrammeImpl
