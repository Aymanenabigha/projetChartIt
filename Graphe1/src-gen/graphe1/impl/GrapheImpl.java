/**
 */
package graphe1.impl;

import graphe1.Colonne;
import graphe1.Couleurs;
import graphe1.Donner;
import graphe1.Graphe;
import graphe1.Graphe1Package;
import graphe1.TypeGraphe;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphe1.impl.GrapheImpl#getType <em>Type</em>}</li>
 *   <li>{@link graphe1.impl.GrapheImpl#getBagColor <em>Bag Color</em>}</li>
 *   <li>{@link graphe1.impl.GrapheImpl#getColonne <em>Colonne</em>}</li>
 *   <li>{@link graphe1.impl.GrapheImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrapheImpl extends NameImpl implements Graphe {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeGraphe TYPE_EDEFAULT = TypeGraphe.LINE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeGraphe type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBagColor() <em>Bag Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBagColor()
	 * @generated
	 * @ordered
	 */
	protected static final Couleurs BAG_COLOR_EDEFAULT = Couleurs.RED;

	/**
	 * The cached value of the '{@link #getBagColor() <em>Bag Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBagColor()
	 * @generated
	 * @ordered
	 */
	protected Couleurs bagColor = BAG_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColonne() <em>Colonne</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonne()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonne;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Donner data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrapheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphe1Package.Literals.GRAPHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraphe getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeGraphe newType) {
		TypeGraphe oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphe1Package.GRAPHE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Couleurs getBagColor() {
		return bagColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBagColor(Couleurs newBagColor) {
		Couleurs oldBagColor = bagColor;
		bagColor = newBagColor == null ? BAG_COLOR_EDEFAULT : newBagColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphe1Package.GRAPHE__BAG_COLOR, oldBagColor,
					bagColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Colonne> getColonne() {
		if (colonne == null) {
			colonne = new EObjectResolvingEList<Colonne>(Colonne.class, this, Graphe1Package.GRAPHE__COLONNE);
		}
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Donner getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject) data;
			data = (Donner) eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphe1Package.GRAPHE__DATA, oldData,
							data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Donner basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Donner newData) {
		Donner oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphe1Package.GRAPHE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Graphe1Package.GRAPHE__TYPE:
			return getType();
		case Graphe1Package.GRAPHE__BAG_COLOR:
			return getBagColor();
		case Graphe1Package.GRAPHE__COLONNE:
			return getColonne();
		case Graphe1Package.GRAPHE__DATA:
			if (resolve)
				return getData();
			return basicGetData();
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
		case Graphe1Package.GRAPHE__TYPE:
			setType((TypeGraphe) newValue);
			return;
		case Graphe1Package.GRAPHE__BAG_COLOR:
			setBagColor((Couleurs) newValue);
			return;
		case Graphe1Package.GRAPHE__COLONNE:
			getColonne().clear();
			getColonne().addAll((Collection<? extends Colonne>) newValue);
			return;
		case Graphe1Package.GRAPHE__DATA:
			setData((Donner) newValue);
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
		case Graphe1Package.GRAPHE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Graphe1Package.GRAPHE__BAG_COLOR:
			setBagColor(BAG_COLOR_EDEFAULT);
			return;
		case Graphe1Package.GRAPHE__COLONNE:
			getColonne().clear();
			return;
		case Graphe1Package.GRAPHE__DATA:
			setData((Donner) null);
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
		case Graphe1Package.GRAPHE__TYPE:
			return type != TYPE_EDEFAULT;
		case Graphe1Package.GRAPHE__BAG_COLOR:
			return bagColor != BAG_COLOR_EDEFAULT;
		case Graphe1Package.GRAPHE__COLONNE:
			return colonne != null && !colonne.isEmpty();
		case Graphe1Package.GRAPHE__DATA:
			return data != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", bagColor: ");
		result.append(bagColor);
		result.append(')');
		return result.toString();
	}

} //GrapheImpl
