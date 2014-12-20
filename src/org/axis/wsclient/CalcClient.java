package org.axis.wsclient;

import org.axis.wssample.ws.generated.Calculator;
import org.axis.wssample.ws.generated.CalculatorService;
import org.axis.wssample.ws.generated.CalculatorServiceLocator;


public class CalcClient {
	public static void main (String[] args) throws Exception{
		CalculatorService service=new CalculatorServiceLocator();
		Calculator calc=service.getcalculator();
		System.out.print("15 + 6=" + calc.add(15, 6));
		System.out.print("15 - 6=" + calc.substract(15, 6));
	}
}
