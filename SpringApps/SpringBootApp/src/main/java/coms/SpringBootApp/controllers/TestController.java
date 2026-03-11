package coms.SpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import coms.SpringBootApp.beans.Student;

@Controller
public class TestController {

	@GetMapping("/pg1")
	public String Page1(Model m)
	{
		return "DemoPage";
	}

	@GetMapping("/pg2")
	public String Page2(Model m)
	{
		return "TestPage";
	}

	@GetMapping("/login")
	public String Login(Model m)
	{
		return "LoginPage";
	}
	
	@PostMapping("/loginProcess")
	public String Login(@RequestParam("txtUname") String uname,
			@RequestParam("txtPwd") String pwd,
			Model m)
	{
		System.out.println(uname + "  " + pwd);
		
		if(uname.equalsIgnoreCase("Orbit") && pwd.equalsIgnoreCase("abc@123"))
			return "Welcome";
		else
			m.addAttribute("msg", "Please check username/password");
		return "LoginPage";
		
	}
	
	@GetMapping("/welcome")
	public String Welcome(Model m)
	{
		return "Welcome";
	}
	
	@GetMapping("/sreg")
	public String StdRegPage(Model m)
	{
		Student std = new Student();
		m.addAttribute("std", std);
		return "StdReg";
	}
	
	@PostMapping("/stdinfo")
	public String StdRegPage(@ModelAttribute("std") Student std, Model m)
	{
		System.out.println(std.getSname());
		System.out.println(std.getGender());
		System.out.println(std.getLocation());
		m.addAttribute("std", new Student());
		return "StdReg";
	}
}
