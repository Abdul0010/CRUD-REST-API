package com.masafat.Controller;

import com.masafat.Model.Car;
import com.masafat.Repository.carRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author by AbdulQader
 * on 16/4/2019.
 */
@RestController
public class CarController {
    @Autowired
    private carRepository repository;
    @GetMapping("/Cars")
    public List<Car> retrieveAllStudents() {
        return (List<Car>) repository.findAll();
    }
}
