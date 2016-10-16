/**
 * 
 */
package com.spring.cloud.personservice.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.cloud.personservice.domain.Person;

/**
 * @author muralimanohar
 *
 */
public interface PersonRepository extends CrudRepository<Person, BigInteger>{
    List<Person> findAll();
    Person getByPersonId(BigInteger personId);
    Person findByPersonId(BigInteger personId);
    Person save(Person person);
    void delete(Person person);
}
