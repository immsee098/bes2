package com.example.demo.model;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "people")
public class Person {
    public Person() {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, Age age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Id
    @Column(name = "name")
    private String name;

    @Embedded
    private Age age;

    @Column(name = "gender")
    @Embedded
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_name")
    @OrderBy("name")
    private List<Item> items = new ArrayList<>();

    public String name() {
        return name;
    }

    public Age age() {
        return age;
    }

    public Gender gender() {
        return gender;
    }

    public void changeAge(Age age) {
        this.age = age;
    }

    public void addItem(String name, String usage) {
        Item item = new Item(name, usage, this.name);

        items.add(item);
    }

    public void removeItem(String name) {
        Optional<Item> item = items.stream()
                .filter(i -> i.name().equals(name))
                .findFirst();

        if (item.isEmpty()) {
            return;
        }

        items.remove(item.get());
    }

    public List<Item> items() {
        return new ArrayList<>(items);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", items=" + items +
                '}';
    }
}
