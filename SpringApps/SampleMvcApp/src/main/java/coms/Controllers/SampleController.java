package coms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@GetMapping("/pg1")
	public String  Page1(Model m)
	{
		m.addAttribute("x", 100);
		return  "DemoPage1";  //DemoPage1 is  jsp filename
	}
	
	@GetMapping("/pg2")
	public String  Page2(ModelMap m)
	{
		String sname = "Phani";
		int age = 25;
		m.addAttribute("sname", sname).addAttribute("age", age);
		return  "DemoPage2";  //DemoPage2 is  jsp filename
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
}
