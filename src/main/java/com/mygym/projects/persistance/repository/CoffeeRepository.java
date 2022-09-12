package com.mygym.projects.persistance.repository;

import com.mygym.projects.persistance.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
