package coms.SpringJpaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.SpringJpaApp.beans.Cricket;
import coms.SpringJpaApp.repo.CricketRepo;

@Service
public class CricketServiceImpl implements CricketService {

	@Autowired
	CricketRepo cr;
	
	@Override
	public void AddCricketer(Cricket crk) {		
		cr.save(crk);
		System.out.println("Cricketer Added..");
	}

	@Override
	public List<Cricket> ShowAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Cricket Search(int crno) {
		// TODO Auto-generated method stub
	 Optional<Cricket> crkinfo = cr.findById(crno);
	 
	 	if(crkinfo.isPresent())
	 		return crkinfo.get();
	 	
		return null;
	}

	@Override
	public void DelCricketer(int crno) {
		// TODO Auto-generated method stub
		cr.deleteById(crno);
	}

	@Override
	public void UpdateCricketer(Cricket crk) {
		// TODO Auto-generated method stub
		cr.saveAndFlush(crk);
		System.out.println("Modified");
	}

	@Override
	public List<Cricket> ShowCricBasedGame(String game) {
		// TODO Auto-generated method stub
		return cr.SearchCrkBasedGame(game);
	}
}
