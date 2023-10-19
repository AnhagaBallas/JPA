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

    @Override
    <S extends Person> S save(S entity);
}
