package com.masafat.Controller;

import com.masafat.Model.Car;
import com.masafat.Repository.carRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author by AbdulQader
 * on 16/4/2019.
 */
@RestController
public class CarController {
    @Autowired
    private carRepository repository;
    @GetMapping("/Cars")
    public List<Car> getAllCars() {
        return (List<Car>) repository.findAll();
    }

    @GetMapping("/Cars/{id}")
    public Optional<Car> getCarDetails(@PathVariable int id){
        return repository.findById(id);

    }
    @PostMapping("/Cars/create")
    public void creatCar(@RequestBody Car carDetails){
        repository.save(carDetails);
    }

}
