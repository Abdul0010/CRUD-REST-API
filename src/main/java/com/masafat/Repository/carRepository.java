package com.masafat.Repository;

import com.masafat.Model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Author by AbdulQader
 * on 16/4/2019.
 */
@Repository
public interface carRepository extends CrudRepository<Car,Integer> {
    Optional<Car> findById(Integer id);

}
