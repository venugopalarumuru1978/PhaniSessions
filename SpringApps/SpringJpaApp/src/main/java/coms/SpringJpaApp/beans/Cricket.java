package coms.SpringJpaApp.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cric_Info_T20")
public class Cricket {

	@Id
	@GeneratedValue
	private int crno;
	
	private String crname;
	private String crgame;
	private int runs;
	
	public int getCrno() {
		return crno;
	}
	public void setCrno(int crno) {
		this.crno = crno;
	}
	public String getCrname() {
		return crname;
	}
	public void setCrname(String crname) {
		this.crname = crname;
	}
	public String getCrgame() {
		return crgame;
	}
	public void setCrgame(String crgame) {
		this.crgame = crgame;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	
	
}
