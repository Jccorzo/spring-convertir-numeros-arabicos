package com.springboot;

import java.util.TreeMap;

public class NumberOperation {
	
	NumberOperation() {}
	
    private static final TreeMap<Integer, String> map = new TreeMap<>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static String transformNumberToRoman(int requestNumber) {
        int consultedNumber =  map.floorKey(requestNumber);
        if ( requestNumber == consultedNumber ) {
            return map.get(requestNumber);
        }
        return map.get(consultedNumber) + transformNumberToRoman(requestNumber-consultedNumber);
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
