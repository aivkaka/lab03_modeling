/**
 */
package org.rm2pt.sample.basicfamily.metamodel.basicfamily.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rm2pt.sample.basicfamily.metamodel.basicfamily.BasicfamilyPackage;
import org.rm2pt.sample.basicfamily.metamodel.basicfamily.Man;
import org.rm2pt.sample.basicfamily.metamodel.basicfamily.Person;
import org.rm2pt.sample.basicfamily.metamodel.basicfamily.Woman;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.basicfamily.metamodel.basicfamily.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicfamily.metamodel.basicfamily.impl.PersonImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicfamily.metamodel.basicfamily.impl.PersonImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicfamily.metamodel.basicfamily.impl.PersonImpl#getFather <em>Father</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicfamily.metamodel.basicfamily.impl.PersonImpl#getMother <em>Mother</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> parents;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> children;

	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected Man father;

	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected Woman mother;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicfamilyPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicfamilyPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getParents() {
		if (parents == null) {
			parents = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this,
					BasicfamilyPackage.PERSON__PARENTS, BasicfamilyPackage.PERSON__CHILDREN);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this,
					BasicfamilyPackage.PERSON__CHILDREN, BasicfamilyPackage.PERSON__PARENTS);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Man getFather() {
		if (father != null && father.eIsProxy()) {
			InternalEObject oldFather = (InternalEObject) father;
			father = (Man) eResolveProxy(oldFather);
			if (father != oldFather) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicfamilyPackage.PERSON__FATHER,
							oldFather, father));
			}
		}
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Man basicGetFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(Man newFather) {
		Man oldFather = father;
		father = newFather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicfamilyPackage.PERSON__FATHER, oldFather,
					father));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Woman getMother() {
		if (mother != null && mother.eIsProxy()) {
			InternalEObject oldMother = (InternalEObject) mother;
			mother = (Woman) eResolveProxy(oldMother);
			if (mother != oldMother) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicfamilyPackage.PERSON__MOTHER,
							oldMother, mother));
			}
		}
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Woman basicGetMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(Woman newMother) {
		Woman oldMother = mother;
		mother = newMother;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicfamilyPackage.PERSON__MOTHER, oldMother,
					mother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicfamilyPackage.PERSON__PARENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParents()).basicAdd(otherEnd, msgs);
		case BasicfamilyPackage.PERSON__CHILDREN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicfamilyPackage.PERSON__PARENTS:
			return ((InternalEList<?>) getParents()).basicRemove(otherEnd, msgs);
		case BasicfamilyPackage.PERSON__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
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
		case BasicfamilyPackage.PERSON__NAME:
			return getName();
		case BasicfamilyPackage.PERSON__PARENTS:
			return getParents();
		case BasicfamilyPackage.PERSON__CHILDREN:
			return getChildren();
		case BasicfamilyPackage.PERSON__FATHER:
			if (resolve)
				return getFather();
			return basicGetFather();
		case BasicfamilyPackage.PERSON__MOTHER:
			if (resolve)
				return getMother();
			return basicGetMother();
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
		case BasicfamilyPackage.PERSON__NAME:
			setName((String) newValue);
			return;
		case BasicfamilyPackage.PERSON__PARENTS:
			getParents().clear();
			getParents().addAll((Collection<? extends Person>) newValue);
			return;
		case BasicfamilyPackage.PERSON__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends Person>) newValue);
			return;
		case BasicfamilyPackage.PERSON__FATHER:
			setFather((Man) newValue);
			return;
		case BasicfamilyPackage.PERSON__MOTHER:
			setMother((Woman) newValue);
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
		case BasicfamilyPackage.PERSON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasicfamilyPackage.PERSON__PARENTS:
			getParents().clear();
			return;
		case BasicfamilyPackage.PERSON__CHILDREN:
			getChildren().clear();
			return;
		case BasicfamilyPackage.PERSON__FATHER:
			setFather((Man) null);
			return;
		case BasicfamilyPackage.PERSON__MOTHER:
			setMother((Woman) null);
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
		case BasicfamilyPackage.PERSON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasicfamilyPackage.PERSON__PARENTS:
			return parents != null && !parents.isEmpty();
		case BasicfamilyPackage.PERSON__CHILDREN:
			return children != null && !children.isEmpty();
		case BasicfamilyPackage.PERSON__FATHER:
			return father != null;
		case BasicfamilyPackage.PERSON__MOTHER:
			return mother != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
