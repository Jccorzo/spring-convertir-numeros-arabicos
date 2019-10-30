package com.springboot;

import java.util.TreeMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Number {
	
	@Id @GeneratedValue private Long id;
	@Getter @Setter private String requestedNumber;
	@Getter @Setter private String responsedNumber;
	
	
	 Number() {}
	
	 public Number(String requestedNumber, String responsedNumber) {
		this.requestedNumber = requestedNumber;
		this.responsedNumber = responsedNumber;
	}	
	
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
}
	

