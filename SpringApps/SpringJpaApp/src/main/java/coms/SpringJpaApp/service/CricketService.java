package coms.SpringJpaApp.service;

import java.util.List;

import coms.SpringJpaApp.beans.Cricket;

public interface CricketService {

	public void AddCricketer(Cricket crk);
	public List<Cricket> ShowAll();
	public Cricket  Search(int crno);
	public void DelCricketer(int crno);
	public void UpdateCricketer(Cricket crk);
	public List<Cricket> ShowCricBasedGame(String game);
	
}
