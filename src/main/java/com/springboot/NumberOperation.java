package com.springboot;

import java.util.TreeMap;

public class NumberOperation {
	
	NumberOperation() {}
	
    private static final TreeMap<Integer, String> number = new TreeMap<>();

    static {

        number.put(1000, "M");
        number.put(900, "CM");
        number.put(500, "D");
        number.put(400, "CD");
        number.put(100, "C");
        number.put(90, "XC");
        number.put(50, "L");
        number.put(40, "XL");
        number.put(10, "X");
        number.put(9, "IX");
        number.put(5, "V");
        number.put(4, "IV");
        number.put(1, "I");

    }

    public static String transformNumberToRoman(int requestNumber) {
        int consultedNumber =  number.floorKey(requestNumber);
        if ( requestNumber == consultedNumber ) {
            return number.get(requestNumber);
        }
        return number.get(consultedNumber) + transformNumberToRoman(requestNumber-consultedNumber);
    }

    public static boolean validateNumber(String requestedNumber) {
    	boolean numberIsValid = true; 
    	
    	if(!isNumber(requestedNumber)) {
    		numberIsValid = false;
    	}else {
    		int number = Integer.parseInt(requestedNumber);
    		if(number <= 0 || number > 3999) {
        		numberIsValid = false;
        	}
    	}
		return numberIsValid;	
    }
    
    public static boolean isNumber(String requestedNumber) {
    	 boolean isNumber = true;
         try {
             Integer.parseInt(requestedNumber);
         } catch (NumberFormatException excepcion) {
        	 isNumber = false;
         }
         return isNumber;
     }

}
