package com.isad;

import java.util.ArrayList;

public class GaixoZerrenda {
	private ArrayList<Gaixoa> gaixoZerrenda;

	public GaixoZerrenda() {
		gaixoZerrenda = new ArrayList<Gaixoa>();
	}

	public ArrayList<Gaixoa> getGaixoZerrenda() {
		return gaixoZerrenda;
	}
	
	public Gaixoa bilatuGaixoa(String zenbakia){
		for (Gaixoa gaixoa : gaixoZerrenda) {
			if(zenbakia.equals(gaixoa.getOsakidetzaZenbakia())){
				return gaixoa;
			}
		}
		return null;
	}
}
