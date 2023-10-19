package com.netology.daohibarnate.service;

import com.netology.daohibarnate.model.Person;
import com.netology.daohibarnate.model.PersonalData;
import com.netology.daohibarnate.repository.HibernateRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HibernateServiceImpl implements HibernateService {
    @NonNull
    private HibernateRepository hibernateRepository;

    @Override
    public List<Person> getByCity(String city) {
        return hibernateRepository.findPersonByCity(city);
    }

    @Override
    public void addPerson(PersonalData personalData, String phoneNumber, String city) {
        hibernateRepository.save(Person.builder()
                .personalData(personalData)
                .phone_number(phoneNumber)
                .city(city)
                .build());

    }
}
