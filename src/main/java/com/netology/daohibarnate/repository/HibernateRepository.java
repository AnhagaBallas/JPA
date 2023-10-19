package com.netology.daohibarnate.repository;

import com.netology.daohibarnate.model.Person;
import com.netology.daohibarnate.model.PersonalData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HibernateRepository extends CrudRepository<Person, PersonalData> {
    List<Person> findPersonByCity(String city);

    @Override
    <S extends Person> S save(S entity);


}
