package com.example.demo.laptop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    String getLaptopNameById(Integer id){
        return jdbcTemplate.queryForObject(
                "select name from laptop where id = ?",
                String.class,
                id);
    }

}















//com.waleed.training.laptops
//        LaptopController
//        LaptopService
//        LaptopRepository
//
//com.waleed.training.monitors
//        MonitorController
//        MonitorService
//        MonitorRepository

//com.waleed.training.controllers
//        LaptopController
//        MonitorController
//com.waleed.training.services
//        LaptopService
//        MonitorService
//com.waleed.training.repositories
//        LaptopRepository
//        MonitorRepository

