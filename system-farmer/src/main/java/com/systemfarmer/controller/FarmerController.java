/*
 * package com.systemfarmer.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.systemfarmer.model.Farmers;
import com.systemfarmer.repo.FarmerRepository;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class FarmerController {
	
	@Autowired
    FarmerRepository repo;
	
	@RequestMapping(value="/farmer",method=RequestMethod.GET)
	public List<Farmers> getAllFarmersDetails(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/farmer/{id}",method=RequestMethod.GET)
	  public Optional<Farmers> getFarmersDetails(@PathVariable String id) {
		return repo.findById(id);
	  }
	
	@RequestMapping(value="/farmerCrop/{farmerId}",method=RequestMethod.GET)
	  public List<Farmers> getByFarmerId(@PathVariable String farmerId) {
		return repo.findByFarmerId(farmerId);
	  }
	


	  @RequestMapping(value="/farmer",method=RequestMethod.POST)
	  public void addFarmersDetails(@RequestBody Farmers farmers) {
		  repo.insert(farmers);
	  }

	  @RequestMapping(value="/farmer/{id}",method=RequestMethod.PUT)
	  public void updateFarmersDetails(@PathVariable String id, @RequestBody Farmers farmers) {
		  repo.save(farmers);
	  }

	  @RequestMapping(value="/farmer/{id}",method=RequestMethod.DELETE)
	  public void deleteFarmersDetails(@PathVariable String id) {
	    repo.deleteById(id);
	  }


}
*/