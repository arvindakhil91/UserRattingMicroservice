package com.demo.userRattingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.userRattingService.models.Ratting;
import com.demo.userRattingService.service.RattingService;


//http://localhost:8081/serviceB/getStudentAddress/2
	
@RestController
@RequestMapping("/serviceB")
@CrossOrigin
public class UserRatingSerrviceController {
	
	
	@Autowired
	RattingService rattingService;
	
	
	@GetMapping("/getAllUserRatting/{id}")
	public Ratting getUserRatting(@PathVariable("id") int id){
		
		return rattingService.getAllRattingUser().stream()
		.filter(i -> i.getId()==id).findFirst().orElse(null);
	}
	
	
//	http://localhost:8081/serviceB/getAllUserRatting
	@GetMapping("/getAllUserRatting")
	public List<Ratting> getAllUserRatting(){
		
		 return rattingService.getAllRattingUser();
	}
	
	@PostMapping("/addRatting")
	public String addRatting(@RequestBody  Ratting ratting ) {
		 return rattingService.addRatting(ratting);
	}

}
