package coms.SpringJpaApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import coms.SpringJpaApp.beans.Cricket;
import coms.SpringJpaApp.service.CricketService;

@Controller
public class CricketController {

	@Autowired
	CricketService cs;
	
	@GetMapping("/newcrk")
	public String AddCrkr(Model m)
	{
		m.addAttribute("crk", new Cricket());
		return "AddCricketer";
	}
	
	@PostMapping("/crkinfo")
	public String AddCrkr(@ModelAttribute("crk") Cricket crk, Model m)
	{
		cs.AddCricketer(crk);
		m.addAttribute("crk", new Cricket());
		return "redirect:/viewall";
	}
	
	@GetMapping("/viewall")
	public String ViewAllCricInfo(Model m)
	{
		List<Cricket>  crkList = cs.ShowAll();
		m.addAttribute("crkList", crkList);
		return "ViewAllCricketers";
	}
	
	@GetMapping("/searchcrk")
	public String SearchCrkr(Model m)
	{		
		return "SearchCricketer";
	}

	@PostMapping("/searchInfo")
	public String SearchCrkr(@RequestParam("txtCrno") int cno, Model m)
	{
		Cricket crkinfo = cs.Search(cno);
		
		if(crkinfo!=null)
			m.addAttribute("crkinfo", crkinfo);
		else
			m.addAttribute("crkinfo", null);
		return "SearchCricketer";
	}
	
	@GetMapping("/delcrk/{crno}")
	public String DelCrk(@PathVariable("crno") int crno, Model m)
	{
		System.out.println(crno);
		cs.DelCricketer(crno);
		return "redirect:/viewall";
	}
	
	@GetMapping("/modcrk/{crno}")
	public String ModCrk(@PathVariable("crno") int crno, Model m)
	{
		Cricket crk = cs.Search(crno);
		m.addAttribute("crk", crk);
		return "UpdateCricketer";
	}
	
	@PostMapping("/modInfo")
	public String ModCrk(@ModelAttribute("crk") Cricket crk, Model m)
	{
		cs.UpdateCricketer(crk);
		return "redirect:/viewall";
	}
	
	@GetMapping("/gamecrk")
	public String CrikOnGame(Model m)
	{
		return "CricketersByGame";
	}

	@PostMapping("/gameinfo")
	public String CrikOnGame(@RequestParam("txtGame") String game, Model m)
	{
		List<Cricket> crkGameList = cs.ShowCricBasedGame(game);
		m.addAttribute("crkGameList", crkGameList);
		return "CricketersByGame";
	}
}
