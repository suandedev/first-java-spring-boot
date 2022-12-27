package com.example.demo;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyAplication {

    @GetMapping("/")
    public String index() {
        return "success";
    }

    @GetMapping("/persons")
    public String persons() {

        Person person = new Person();
        person.setName("John");
        person.setAge("20");

        Person person2 = new Person();
        person2.setName("Jane");
        person2.setAge("21");

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person);
        persons.add(person2);

        return persons.get(1).getName() + " " + persons.get(1).getAge();
    }

    @GetMapping("/person")
    public String person() {
        Person person = new Person();
        person.setName("John");
        person.setAge("20");

        return person.getName() + " " + person.getAge();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(MyAplication.class, args);
    }
}

class Person {
    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
