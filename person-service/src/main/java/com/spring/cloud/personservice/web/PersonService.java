/**
 * 
 */
package com.spring.cloud.personservice.web;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.personservice.dao.PersonRepository;
import com.spring.cloud.personservice.domain.Person;

/**
 * @author muralimanohar
 *
 */
@RestController
@RequestMapping("/PersonService")
public class PersonService {
	@Autowired
	private PersonRepository photoRepo;
	/**
	 * Returns Album details by albumId
	 * @param albumId
	 * @return
	 */
	@RequestMapping(value="/getPersonsById/{personId}", method = RequestMethod.GET)
	public @ResponseBody Person getPersonById(@PathVariable BigInteger personId){
		return photoRepo.getByPersonId(personId);
	}
	
	@RequestMapping(value="/getAllPersons", method = RequestMethod.GET)
	public @ResponseBody List<Person> getAllPersons(){
		return photoRepo.findAll();
	}
}
