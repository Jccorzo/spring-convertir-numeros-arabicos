package com.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
class Number {
	
	private @Id @GeneratedValue Long id;
	@Getter @Setter private String requestedNumber;
	@Getter @Setter private String responsedNumber;
	
	
	 Number() {}
	
	 Number(String requestedNumber, String responsedNumber) {
		this.requestedNumber = requestedNumber;
		this.responsedNumber = responsedNumber;
	}	
	

}
	

