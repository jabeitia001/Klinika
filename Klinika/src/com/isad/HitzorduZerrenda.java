package com.isad;

import java.util.ArrayList;
import java.util.Iterator;

public class HitzorduZerrenda {
	private ArrayList<Hitzordua> hitzorduZerrenda;

	public HitzorduZerrenda() {
		hitzorduZerrenda = new ArrayList<Hitzordua>();
	}

	public ArrayList<Hitzordua> getHitzorduZerrenda() {
		return hitzorduZerrenda;
	}

	public boolean konprobatuHitzorduak(String data) {

		for (Hitzordua hitzordua : hitzorduZerrenda) {
			if (data.equals(hitzordua.getOrduaEguna())) {
				return true;
			}
		}
		return false;
	}

	public Hitzordua emanHitzordua(String data) {

		for (Hitzordua hitzordua : hitzorduZerrenda) {
			if (data.equals(hitzordua.getOrduaEguna())) {
				return hitzordua;
			}
		}
		return null;
	}

	public void ezabatuHitzordua(Hitzordua hitz) {
		Hitzordua aux=null;
		for (Hitzordua hitzordua : hitzorduZerrenda) {
			if (hitz.getOrduaEguna().equals(hitzordua.getOrduaEguna())) {
				aux = hitzordua;
			}
		}
		this.getHitzorduZerrenda().remove(aux);
	}

	public void inprimatuHitzorduGuztiak() {
		if (this.getHitzorduZerrenda().size() != 0) {
			for (Hitzordua hitzordua : hitzorduZerrenda) {
				System.out.println("Hitzordua: " + hitzordua.getOrduaEguna()
						+ " " + hitzordua.getIdMedikua() + " "
						+ hitzordua.getGaixoZenbakia());
			}
		}
		else{
			System.out.println("Mediku horrek ez dauka zitarik");
		}
	}

}
