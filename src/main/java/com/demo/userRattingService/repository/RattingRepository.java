package com.demo.userRattingService.repository;
import org.springframework.data.repository.CrudRepository;

import com.demo.userRattingService.models.Ratting;  

public interface RattingRepository extends CrudRepository<Ratting, Integer>  
{  
	
}  
