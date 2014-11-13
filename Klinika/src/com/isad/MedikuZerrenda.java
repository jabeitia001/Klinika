package com.isad;

import java.util.ArrayList;
import java.util.Iterator;

public class MedikuZerrenda {
	private ArrayList<Medikua> medikuZerrenda;

	public MedikuZerrenda() {
		medikuZerrenda = new ArrayList<Medikua>();
	}

	public ArrayList<Medikua> getMedikuZerrenda() {
		return medikuZerrenda;
	}
	
	public Medikua bilatuMedikua (int medID){
		
		for (Medikua medikua : medikuZerrenda) 
			     if (medikua.getId()==medID)
	        	     return medikua;

		return null;

	}
	
	public Medikua bilatuLehenMedikuLibrea (String data){
		
		for (Medikua medikua : medikuZerrenda)
				if  (!medikua.hitzorduaDauka(data))
					return medikua; 
		return null;
		
		}
	
	public void ezabatuHitzordua(Medikua med, Hitzordua hitz){
		med.ezabatuHitzordua(hitz);
	}
	
	public void gehituHitzordua(Medikua med, Hitzordua hitz){
		med.getHitzorduak().getHitzorduZerrenda().add(hitz);
	}
	
	public Hitzordua bilatuHitzordua(Medikua med, String data){
		Hitzordua hitz = med.emanHitzordua(data);
		return hitz;
	}
}
