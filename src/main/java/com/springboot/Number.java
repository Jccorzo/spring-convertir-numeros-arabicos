package com.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Number {
	
	private @Id @GeneratedValue Long id;
	private String requestedNumber;
	private String responsedNumber;
	
	
	 Number() {}
	
	 public Number(String requestedNumber, String responsedNumber) {
		this.requestedNumber = requestedNumber;
		this.responsedNumber = responsedNumber;
	}	
	

}
	

