package com.example.demo;

import com.example.demo.application.*;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import jakarta.transaction.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
public class CreateItemServiceTest {
    private CreateItemService createItemService;

    @Autowired
    private PersonRepository personRepository;

    @BeforeEach
    void setUp() {
        createItemService = new CreateItemService(personRepository);
    }

    @Test
    void createItem() {
        createItemService.createItem("견우", "Z", "...");

        Person person = personRepository.findByName("견우").get();

        assertThat(person.items()).hasSize(2);
    }
}
