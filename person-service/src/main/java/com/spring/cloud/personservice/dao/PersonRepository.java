/**
 * 
 */
package com.spring.cloud.personservice.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.Repository;

import com.spring.cloud.personservice.domain.Person;

/**
 * @author muralimanohar
 *
 */
public interface PersonRepository extends Repository<Person, BigInteger>{
    List<Person> findAll();
    Person getByPersonId(BigInteger personId);
}
