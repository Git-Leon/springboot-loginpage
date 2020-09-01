package com.github.perscholas;

import org.springframework.stereotype.Service;

/**
 * Created by leon on 9/1/2020.
 */
@Service
public class PersonService {
    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }


}
