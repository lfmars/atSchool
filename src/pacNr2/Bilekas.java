package pacNr2;

import java.io.IOException;

public class Bilekas {

	public  Object adder(Object firstValue, Object secondValue) {
		int myValue;
		if(firstValue.getClass() == secondValue.getClass()) {
			if(firstValue instanceof String) {
				return(String)firstValue + (String)firstValue;
			}else if(firstValue instanceof Integer) {
				return (Integer)firstValue +(Integer)secondValue;
			}else if(firstValue instanceof Double) {
				return (Double)firstValue + (Double)secondValue;
			}
		//	return (firstValue)firstValue + (secondValue.getClass().getName())secondValue;
		}
//		try {
//		myValue = (Integer)firstValue + (Integer)secondValue;
//		}catch(Exception e){
//			System.err.println(e + " bad values");
//		}
		return null;
	}
}
