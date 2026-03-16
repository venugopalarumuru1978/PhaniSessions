package coms.SpringRestApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import coms.SpringRestApi.beans.Person;
import coms.SpringRestApi.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService ps;
	
	@PostMapping("/personinfo")
	public ResponseEntity<Object>  AddPerson(@RequestBody  Person perObj)
	{
		ps.AddPerson(perObj);
		return new ResponseEntity<Object>("Added New Person", HttpStatus.CREATED);
	}
	
	@GetMapping("/personinfo")
	public ResponseEntity<List<Person>>  GetAllPersons()
	{
		return new ResponseEntity<List<Person>>(ps.ShowAll(), HttpStatus.OK);
	}
	
	@GetMapping("/personinfo/{pid}")
	public ResponseEntity<Object> SearchPerson(@PathVariable("pid") int pid)
	{
		Person per = ps.Search(pid);
		if(per!=null)
			return new ResponseEntity<Object>(per, HttpStatus.OK);
		
		return new ResponseEntity<Object>("Person Not Found", HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/personinfo/{pid}")
	public ResponseEntity<Object> DelPerson(@PathVariable("pid") int pid)
	{
		Person per = ps.Search(pid);
		if(per!=null)
		{
			ps.DeletePerson(pid);
			return new ResponseEntity<Object>("Person Deleted", HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Person Not Found", HttpStatus.NOT_FOUND);
	}

	@PutMapping("/personinfo/{pid}")
	public ResponseEntity<Object> UpdatePerson(@PathVariable("pid") int pid, 
			@RequestBody Person person)
	{
		Person per = ps.Search(pid);
		if(per!=null)
		{
			per = person;
			ps.UpdatePerson(per);
			return new ResponseEntity<Object>("Person Updated", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<Object>("Person Not Found", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/personinfo/{uname}/{pwd}")
	public ResponseEntity<Object>  CheckUser(@PathVariable("uname") String uname, @PathVariable String pwd)
	{
		Person per = ps.ChkUser(uname, pwd);
		if(per!=null)
			return new ResponseEntity<Object>(per, HttpStatus.ACCEPTED);
		
		return new ResponseEntity<Object>("Person Not Found", HttpStatus.NOT_FOUND);
	}
}
