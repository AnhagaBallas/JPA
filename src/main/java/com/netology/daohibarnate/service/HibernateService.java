package com.netology.daohibarnate.service;

import com.netology.daohibarnate.model.Person;
import com.netology.daohibarnate.model.PersonalData;

import java.util.List;

public interface HibernateService {
    List<Person> getByCity(String city);

    List<Person> getByAge(String age);

    List<Person> getByNameSurname(String name, String surname);


    void addPerson(PersonalData personalData, String phoneNumber, String city);

}
