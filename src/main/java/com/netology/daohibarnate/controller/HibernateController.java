package com.netology.daohibarnate.controller;

import com.netology.daohibarnate.model.Person;
import com.netology.daohibarnate.model.PersonalData;
import com.netology.daohibarnate.service.HibernateServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class HibernateController {

    @NonNull
    private HibernateServiceImpl hibernateService;

    @GetMapping("/persons/by-city")
    public List<Person> getByCity(@RequestParam String city) {
        hibernateService.addPerson(PersonalData.builder()
                .age("22")
                .name("Ivan")
                .surname("Petrov")
                .build(), "+799999", "Moscow"
        );
        return hibernateService.getByCity(city);
    }
}
