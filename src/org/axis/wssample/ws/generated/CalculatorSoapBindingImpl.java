/**
 * CalculatorSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.axis.wssample.ws.generated;

import org.axis.wssample.SimleCalculator;

public class CalculatorSoapBindingImpl implements org.axis.wssample.ws.generated.Calculator{
	SimleCalculator simple=new SimleCalculator();
    public int add(int in0, int in1) throws java.rmi.RemoteException {
        return simple.add(in0, in1);
    }

    public int multiply(int in0, int in1) throws java.rmi.RemoteException {
        return simple.multiply(in0, in1);
    }

    public int substract(int in0, int in1) throws java.rmi.RemoteException {
        return simple.substract(in0, in1);
    }

}
