package com.github.perscholas.repository;

import com.github.perscholas.model.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by leon on 9/1/2020.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
}
