package com.example.daoquerry.service;

import com.example.daoquerry.model.Person;
import com.example.daoquerry.model.PersonalData;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HibernateService {
    List<PersonalData> getByCity(String city);

    List<PersonalData> getByAge(String age);

    List<PersonalData> getByNameSurname(String name, String surname);

    void addPerson(PersonalData personalData, String phoneNumber, String city);


}
