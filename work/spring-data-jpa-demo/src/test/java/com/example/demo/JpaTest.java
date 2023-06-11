package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import jakarta.transaction.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class JpaTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void findAll() {
        List<Person> people = personRepository.findAll();

        assertThat(people).hasSize(2);
    }

    @Test
    void createAndDelete() {
        Person people = new Person("Mr.Big", new Age(35), Gender.male());

        personRepository.save(people);

        Optional<Person> person = personRepository.findByName("Mr.Big");

        personRepository.delete(person.get());
    }
}
