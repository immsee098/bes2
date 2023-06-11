package com.example.demo.application;

import com.example.demo.exceptions.*;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import jakarta.transaction.*;
import org.springframework.stereotype.*;

@Service
@Transactional
public class CreateItemService {
    private PersonRepository personRepository;

    public CreateItemService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void createItem(String personName, String name, String usage) {
        Person person = personRepository.findByName(personName)
                .orElseThrow(() -> new PersonNotFound(personName));

        person.addItem(name, usage);
        personRepository.save(person);
    }
}