package com.example.daoquerry.controller;

import com.example.daoquerry.model.Person;
import com.example.daoquerry.model.PersonalData;
import com.example.daoquerry.service.HibernateServiceImpl;
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
    public List<PersonalData> getByCity(@RequestParam String city) {
        hibernateService.addPerson(PersonalData.builder()
                .age("22")
                .name("Ivan")
                .surname("Petrov")
                .build(), "+799999", "Moscow"
        );
        return hibernateService.getByCity(city);
    }

    @GetMapping("persons/by-age")
    public List<PersonalData> getByAge(@RequestParam String age) {
        hibernateService.addPerson(PersonalData.builder()
                .age("22")
                .name("Ivan")
                .surname("Petrov")
                .build(), "+799999", "Moscow"
        );
        return hibernateService.getByAge(age);
    }

    @GetMapping("persons/by-name")
    public List<PersonalData> getByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        hibernateService.addPerson(PersonalData.builder()
                .age("22")
                .name("Ivan")
                .surname("Petrov")
                .build(), "+799999", "Moscow"
        );
        return hibernateService.getByNameSurname(name, surname);
    }
}
