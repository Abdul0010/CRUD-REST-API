package com.masafat.Repository;

import com.masafat.Model.Car;
import com.masafat.Model.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Author by AbdulQader
 * on 16/4/2019.
 */
@Repository
public interface tripRepository extends CrudRepository<Trip,Integer> {
    Optional<Trip> findById(Integer id);

}
