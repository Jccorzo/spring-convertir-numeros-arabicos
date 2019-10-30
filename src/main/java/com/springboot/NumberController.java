package com.springboot;

import static com.springboot.Number.transformNumberToRoman;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NumberController {
	
	private NumberRepository repository;
	
	NumberController(NumberRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/transformedNumbers")
	   public List<Number> consultTransformedNumbers() {
	    return repository.findAll();
	  }
	 

	@PostMapping("/getNumber")
		public String newNumber(@RequestParam(value = "number") String consultedNumber) {
		String responsedNumber = transformNumberToRoman(Integer.parseInt(consultedNumber));
		Number objectToSave = new Number(consultedNumber, responsedNumber);
		repository.save(objectToSave);
		return responsedNumber;
	  }
	
}
