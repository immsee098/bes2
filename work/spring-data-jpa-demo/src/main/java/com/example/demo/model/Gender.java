package com.example.demo.model;

import jakarta.persistence.*;

import java.util.*;

@Embeddable
public class Gender {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return Objects.equals(value, gender.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Column(name = "gender")
    private String value;


    private Gender(String value) {
        this.value = value;
    }

    public Gender() {

    }

    public static Gender male() {
        return new Gender("남");
    }

    public static Gender female() {
        return new Gender("여");
    }

    @Override
    public String toString() {
        return value;
    }
}
