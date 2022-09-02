package com.myProject.FoodForSoul;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/FoodForSoul/getClient")
	public List<String> getClients(){
		List<String> client = new ArrayList<>();
		client.add("Kush");
		client.add("Yas");
		client.add("Amitabh");
		
		return client;
	}
	
	@PostMapping("/FoodForSoul/addClient")
	public String addClient(@RequestParam(value="name") String name,@RequestParam(value="city")String city)  {
		
	
		return "We welcome you " +name+ " from "+ city + "to Food for Soul" ;
	}
	
}
