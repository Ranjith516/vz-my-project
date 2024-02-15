package com.example.demo.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
	@Autowired
	LaptopService laptopService;
	@GetMapping("/laptop/{id}")
	String getLAptopNameById(@PathVariable Integer id) {
		return laptopService.getLaptopNameById(id);
	}

}
