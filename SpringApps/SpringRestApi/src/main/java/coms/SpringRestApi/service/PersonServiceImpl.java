package coms.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.SpringRestApi.beans.Person;
import coms.SpringRestApi.repo.PersonRepo;
@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepo  pr;
	
	@Override
	public void AddPerson(Person person) {
		// TODO Auto-generated method stub
		pr.save(person);
	}

	@Override
	public List<Person> ShowAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Person Search(int pid) {
		// TODO Auto-generated method stub
		Optional<Person>  perObj = pr.findById(pid);
		if(perObj.isPresent())
			return perObj.get();
		return null;
	}

	@Override
	public void UpdatePerson(Person person) {
		pr.saveAndFlush(person);		
	}

	@Override
	public void DeletePerson(int pid) {
		// TODO Auto-generated method stub
		pr.deleteById(pid);
	}

	@Override
	public Person ChkUser(String email, String pwd) {
		// TODO Auto-generated method stub
		Person person = pr.CheckUserInfo(email, pwd);
		if(person!=null)
			return person;
		return null;
	}
}
