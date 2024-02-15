package com.example.demo.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	@Autowired
	LaptopRepository laptopRepository;
	String getLaptopNameById(Integer id) {
		return laptopRepository.getLaptopNameById(id);
	}
}


