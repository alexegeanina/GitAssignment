package ro.ase.acs.csie.clase;

import java.util.Calendar;

import ro.ase.acs.csie.interfete.Cont;

public class Utilizator implements Cont {
	private String nume;
	private String email;
	private int parola;
	private int anNastere;
	
	public Utilizator() {
		super();
		this.nume = "";
		this.email = "";
		this.parola = 0;
		this.anNastere=0;
	}
	public Utilizator(String nume, String email, int parola,int anNastere) {
		super();
		this.nume = nume;
		this.email = email;
		this.parola = parola;
		this.anNastere=anNastere;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getParola() {
		return parola;
	}
	public void setParola(int parola) {
		this.parola = parola;
	}
	public int getAnNastere() {
		return anNastere;
	}
	public void setAnNastere(int anNastere) {
		this.anNastere = anNastere;
	}
	@Override
	public int calculVarsta() {
		int anCurent = Calendar.getInstance().get(Calendar.YEAR);
		return anCurent-this.anNastere;
		
	}
	
	

}
