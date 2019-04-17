package com.masafat.Controller;

import com.masafat.Model.Trip;
import com.masafat.Repository.tripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author by AbdulQader
 * on 16/4/2019.
 */
@RestController
public class TripController {
    @Autowired
    private tripRepository repository;
    @GetMapping("/Trips")
    public List<Trip> getAllCars() {
        return (List<Trip>) repository.findAll();
    }

    @GetMapping("/Trips/{id}")
    public Optional<Trip> getCarDetails(@PathVariable int id){
        return repository.findById(id);

    }
    @PostMapping("/Trips/create")
    public void creatTrip(@RequestBody Trip tripDetails){
        repository.save(tripDetails);
    }

}
