package com.example.daoquerry.repository;

import com.example.daoquerry.model.Person;
import com.example.daoquerry.model.PersonalData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HibernateRepository extends CrudRepository<Person, PersonalData> {
    @Query("SELECT personalData from Person where city=:city")
    List<PersonalData> findPersonByCity(@Param("city") String city);

    @Query("select personalData from Person where personalData.age<:age order by personalData.age")
    List<PersonalData> findPersonByAge(@Param("age") String age);

    @Query("select personalData from Person where personalData.name=:name and personalData.surname=:surname")
    List<PersonalData> findByNameSurname(@Param("name") String name, @Param("surname") String surname);

    @Override
    <S extends Person> S save(S entity);
}
