package com.isad;

public class Gaixoa {
	private String nan;
	private String osakidetzaZenbakia;
	private String izena;
	private String abizena;
	private int telefonoa;

	
	public Gaixoa(String nan, String osakidetzaZenbakia, String izena, String abizena, int telefonoa) {
		super();
		this.nan = nan;
		this.osakidetzaZenbakia = osakidetzaZenbakia;
		this.izena = izena;
		this.abizena = abizena;
		this.telefonoa = telefonoa;
	}
	
	public int getTelefonoa() {
		return telefonoa;
	}

	public void setTelefonoa(int telefonoa) {
		this.telefonoa = telefonoa;
	}


	public String getNan() {
		return nan;
	}
	public void setNan(String nan) {
		this.nan = nan;
	}
	public String getOsakidetzaZenbakia() {
		return osakidetzaZenbakia;
	}
	public void setOsakidetzaZenbakia(String osakidetzaZenbakia) {
		this.osakidetzaZenbakia = osakidetzaZenbakia;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getAbizena() {
		return abizena;
	}
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}
}
