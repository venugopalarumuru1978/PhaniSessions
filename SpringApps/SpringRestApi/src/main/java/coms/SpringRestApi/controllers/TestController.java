package coms.SpringRestApi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	List<String>  strList = new ArrayList<String>();
	
	public TestController()
	{
		strList.add("Phani");
		strList.add("Ajay");
		strList.add("Venu");
	}
	
	@GetMapping("/test")
	public String test1()
	{
		return "This is REST API example";
	}
	
	@GetMapping("/test2")
	public List<String>  test2()
	{
		return strList;
	}
	
}
