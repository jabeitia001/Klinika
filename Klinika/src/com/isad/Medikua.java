package com.isad;

public class Medikua {
	private int id;
	private String izena;
	private int maxGaixo;
	private HitzorduZerrenda hitzorduak;
	
	public Medikua(int id, String izena, int maxGaixo, HitzorduZerrenda hitzorduak) {
		super();
		this.id = id;
		this.izena = izena;
		this.maxGaixo = maxGaixo;
		this.hitzorduak = hitzorduak;
	}
	
	public HitzorduZerrenda getHitzorduak() {
		return hitzorduak;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public int getMaxGaixo() {
		return maxGaixo;
	}
	public void setMaxGaixo(int maxGaixo) {
		this.maxGaixo = maxGaixo;
	}
	
	public boolean hitzorduaDauka(String data){
		boolean aurkitua=false;
		aurkitua = this.hitzorduak.konprobatuHitzorduak(data);
		if(aurkitua==true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Hitzordua emanHitzordua(String data){
		
		Hitzordua hitz = this.hitzorduak.emanHitzordua(data);
		
		return hitz;
	}
	
	public void ezabatuHitzordua(Hitzordua hitz){
		this.getHitzorduak().ezabatuHitzordua(hitz);
	}
	

}
