package com.example.daoquerry.service;

import com.example.daoquerry.model.Person;
import com.example.daoquerry.model.PersonalData;

import java.util.List;

public interface HibernateService {
    List<PersonalData> getByCity(String city);

    void addPerson(PersonalData personalData, String phoneNumber, String city);

}
