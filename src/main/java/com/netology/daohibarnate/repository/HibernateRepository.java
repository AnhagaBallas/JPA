package com.netology.daohibarnate.repository;

import com.netology.daohibarnate.model.Person;
import com.netology.daohibarnate.model.PersonalData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HibernateRepository extends CrudRepository<Person, PersonalData> {
    List<Person> findPersonByCity(String city);

    List<Person> findPersonByPersonalData_AgeIsLessThanEqualOrderByPersonalData_Age(String age);

    List<Person> findPersonByPersonalData_NameAndPersonalData_Surname(String name, String surname);

    @Override
    <S extends Person> S save(S entity);


}
