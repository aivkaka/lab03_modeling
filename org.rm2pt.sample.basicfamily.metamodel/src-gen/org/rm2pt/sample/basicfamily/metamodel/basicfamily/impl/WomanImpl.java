/**
 */
package org.rm2pt.sample.basicfamily.metamodel.basicfamily.impl;

import org.eclipse.emf.ecore.EClass;

import org.rm2pt.sample.basicfamily.metamodel.basicfamily.BasicfamilyPackage;
import org.rm2pt.sample.basicfamily.metamodel.basicfamily.Woman;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Woman</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WomanImpl extends PersonImpl implements Woman {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WomanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicfamilyPackage.Literals.WOMAN;
	}

} //WomanImpl
