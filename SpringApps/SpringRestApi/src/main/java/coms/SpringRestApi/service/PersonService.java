package coms.SpringRestApi.service;

import java.util.List;

import coms.SpringRestApi.beans.Person;

public interface PersonService {

	public void AddPerson(Person person);
	public List<Person> ShowAll();
	public Person  Search(int pid);
	public void UpdatePerson(Person person);
	public void DeletePerson(int pid);
	public Person ChkUser(String email, String pwd);
	
}
