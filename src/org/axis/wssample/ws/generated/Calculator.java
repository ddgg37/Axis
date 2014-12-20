/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.axis.wssample.ws.generated;

public interface Calculator extends java.rmi.Remote {
    public int add(int in0, int in1) throws java.rmi.RemoteException;
    public int multiply(int in0, int in1) throws java.rmi.RemoteException;
    public int substract(int in0, int in1) throws java.rmi.RemoteException;
}
