package com.isad;

import java.util.Date;

public class Hitzordua {
	private int idMedikua;
	private String gaixoZenbakia;
	private String orduaEguna;
	
	
	public Hitzordua(int idMedikua, String gaixoZenbakia, String orduaEguna) {
		super();
		this.idMedikua = idMedikua;
		this.gaixoZenbakia = gaixoZenbakia;
		this.orduaEguna = orduaEguna;
	}


	public int getIdMedikua() {
		return idMedikua;
	}

	public void setIdMedikua(int idMedikua) {
		this.idMedikua = idMedikua;
	}

	public String getGaixoZenbakia() {
		return gaixoZenbakia;
	}

	public void setGaixoZenbakia(String gaixoZenbakia) {
		this.gaixoZenbakia = gaixoZenbakia;
	}

	public String getOrduaEguna() {
		return orduaEguna;
	}

	public void setOrduaEguna(String orduaEguna) {
		this.orduaEguna = orduaEguna;
	}
	
	
	
	
}
