package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yebelo.app.model.Category;
import com.yebelo.app.service.FetchNumberService;

@RestController
public class FetchNextNumber {

	@Autowired
	private FetchNumberService fetchNumberService;
	
	@GetMapping(value="/FetchNextNumber")
	public ResponseEntity<Object> fetchNextNumber(@RequestBody Category category) {
		Category response = fetchNumberService.getNextNumber(category.getCategoryCode());
		return new ResponseEntity<>(response, HttpStatus.OK);
	
}
}