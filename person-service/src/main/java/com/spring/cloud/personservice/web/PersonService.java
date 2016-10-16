/**
 * 
 */
package com.spring.cloud.personservice.web;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	private PersonRepository personRepo;
	/**
	 * Returns Album details by albumId
	 * @param albumId
	 * @return
	 */
	@RequestMapping(value="/getPersonsById/{personId}", method = RequestMethod.GET)
	public @ResponseBody Person getPersonById(@PathVariable BigInteger personId){
		return personRepo.getByPersonId(personId);
	}
	
	@RequestMapping(value="/getAllPersons", method = RequestMethod.GET)
	public @ResponseBody List<Person> getAllPersons(){
		return personRepo.findAll();
	}
	
	@RequestMapping(value="/addPerson", method = RequestMethod.POST)
	public @ResponseBody Person addPerson(@RequestBody Person person){
		return personRepo.save(person);
	}
	
	@RequestMapping(value="/deletePerson/{personId}", method = RequestMethod.POST)
	public void deletePerson(@PathVariable BigInteger personId){
		Person person = personRepo.findByPersonId(personId);
		personRepo.delete(person);
	}
	
	@RequestMapping(value="/updatePerson", method = RequestMethod.POST)
	public @ResponseBody Person updatePerson(@RequestBody Person personReq){
		Person person = personRepo.findByPersonId(personReq.getPersonId());
		person.setAddress1(personReq.getAddress1());
		person.setAddress2(personReq.getAddress2());
		person.setCity(personReq.getCity());
		person.setState(personReq.getState());
		person.setEmailId(personReq.getEmailId());
		person.setMobile(personReq.getMobile());
		person.setName(personReq.getName());
		person.setFirstName(personReq.getFirstName());
		person.setLastName(personReq.getLastName());
		person.setSex(personReq.getSex());
		
		return personRepo.save(person);
	}
}
