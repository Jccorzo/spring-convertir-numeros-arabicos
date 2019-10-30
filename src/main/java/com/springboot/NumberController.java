package com.springboot;

import static com.springboot.NumberOperation.transformNumberToRoman;
import static com.springboot.NumberOperation.validateNumber;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/getRequestsNumber")
	   public Long getRequestsNumber() {
	    return repository.count();
	  }
	 

	@PostMapping("/getNumber")
		public String transformNumber(@RequestParam(value = "number") String requestedNumber){
		String responsedNumber = "Solicite un número entero mayor a 0 y menor a 3999";
		if (validateNumber(requestedNumber)) {
			responsedNumber = transformNumberToRoman(Integer.parseInt(requestedNumber));
			Number objectToSave = new Number(requestedNumber, responsedNumber);
			repository.save(objectToSave);
		} 
		return responsedNumber;
	  }
	
	@PostMapping("/saveNumber")
	public Number saveNumber (@RequestBody Number newNumber) {
		return repository.save(newNumber);
	}
	
}
