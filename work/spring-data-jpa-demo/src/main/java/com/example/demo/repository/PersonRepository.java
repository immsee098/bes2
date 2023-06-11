package com.example.demo.repository;

import com.example.demo.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface PersonRepository extends CrudRepository<Person, String> {
    List<Person> findAll();
    Optional<Person> findByName(String name);
}
