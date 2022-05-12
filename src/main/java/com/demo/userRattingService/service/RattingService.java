package com.demo.userRattingService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.userRattingService.models.Ratting;
import com.demo.userRattingService.repository.RattingRepository;

@Service
public class RattingService {
	
	
	@Autowired  
	RattingRepository rattingRepository; 
	
	public List<Ratting> getAllRattingUser()   
	{  
	List<Ratting> rattings = new ArrayList<Ratting>();  
	rattingRepository.findAll().forEach(ratting -> rattings.add(ratting));  
	return rattings;  
	} 
	
	public String addRatting(Ratting ratting) {
		rattingRepository.save(ratting);
		return "Success";
	}

}
