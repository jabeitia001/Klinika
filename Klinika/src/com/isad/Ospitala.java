package com.isad;

public class Ospitala {

	private MedikuZerrenda medikuak;
	private GaixoZerrenda gaixoak;

	public Ospitala() {
		medikuak = new MedikuZerrenda();
		gaixoak = new GaixoZerrenda();
	}

	public static void main(String[] args) {

		Ospitala os = new Ospitala();

		os.datuakKargatu();

	}

	public void datuakKargatu() {

		// Hitzorduak kargatu
		Hitzordua hitz1 = new Hitzordua(1111111, "12345678Z", "2014/01/12");
		Hitzordua hitz2 = new Hitzordua(1111111, "98765432V", "2014/01/26");
		Hitzordua hitz3 = new Hitzordua(2222222, "78945632X", "2014/03/21");
		Hitzordua hitz4 = new Hitzordua(3333333, "85697423B", "2014/10/15");
		Hitzordua hitz5 = new Hitzordua(3333333, "78945632X", "2014/09/08");
		Hitzordua hitz6 = new Hitzordua(3333333, "12345678P", "2014/01/21");

		HitzorduZerrenda hitzMed1 = new HitzorduZerrenda();
		hitzMed1.getHitzorduZerrenda().add(hitz1);
		hitzMed1.getHitzorduZerrenda().add(hitz2);

		HitzorduZerrenda hitzMed2 = new HitzorduZerrenda();
		hitzMed2.getHitzorduZerrenda().add(hitz3);

		HitzorduZerrenda hitzMed3 = new HitzorduZerrenda();
		hitzMed3.getHitzorduZerrenda().add(hitz4);
		hitzMed3.getHitzorduZerrenda().add(hitz5);
		hitzMed3.getHitzorduZerrenda().add(hitz6);

		HitzorduZerrenda hitzMed4 = new HitzorduZerrenda();

		// Medikuak Kargatu
		Medikua medikua1 = new Medikua(1111111, "Jon", 3, hitzMed1);
		Medikua medikua2 = new Medikua(2222222, "Kepa", 4, hitzMed2);
		Medikua medikua3 = new Medikua(3333333, "Patxi", 3, hitzMed3);
		Medikua medikua4 = new Medikua(4444444, "Juan", 5, hitzMed4);

		medikuak.getMedikuZerrenda().add(medikua1);
		medikuak.getMedikuZerrenda().add(medikua2);
		medikuak.getMedikuZerrenda().add(medikua3);
		medikuak.getMedikuZerrenda().add(medikua4);

		Gaixoa gaixo1 = new Gaixoa("72365897C", "12345678Z", "Ander",
				"Andersen", 946875236);
		Gaixoa gaixo2 = new Gaixoa("72895897X", "98765432V", "Etxeza",
				"Etxeton", 956328745);
		Gaixoa gaixo3 = new Gaixoa("45695782P", "78945632X", "Alex", "Alexon",
				985632147);
		Gaixoa gaixo4 = new Gaixoa("56987412Y", "85697423B", "Peter",
				"Petersen", 635897412);
		Gaixoa gaixo5 = new Gaixoa("56987412Y", "12345678P", "Paul", "Poulson",
				654789321);

		gaixoak.getGaixoZerrenda().add(gaixo1);
		gaixoak.getGaixoZerrenda().add(gaixo2);
		gaixoak.getGaixoZerrenda().add(gaixo3);
		gaixoak.getGaixoZerrenda().add(gaixo4);
		gaixoak.getGaixoZerrenda().add(gaixo5);

	}

	public void medikuBatenZitakEzeztatu(int medikuZenb, String zeinData) {
		Medikua med1 = medikuak.bilatuMedikua(medikuZenb);
		Hitzordua hitz = medikuak.bilatuHitzordua(med1, zeinData);

		if (hitz != null) {
			Medikua med2 = medikuak.bilatuLehenMedikuLibrea(zeinData);

			medikuak.gehituHitzordua(med2, hitz);
			medikuak.ezabatuHitzordua(med1, hitz);

			System.out.println("Ezeztutako zita: " + hitz.getOrduaEguna() + " "
					+ hitz.getIdMedikua() + " " + hitz.getGaixoZenbakia());
			System.out.println("\n");

			Gaixoa gaixoa = gaixoak.bilatuGaixoa(hitz.getGaixoZenbakia());

			System.out.println("Gaixoa: " + gaixoa.getIzena() + " "
					+ gaixoa.getAbizena() + " "+gaixoa.getTelefonoa()+" " + gaixoa.getNan()+" "+hitz.getOrduaEguna());

			System.out.println("\n");
			System.out.println("Medikuaren ezabatutako zitak: ");
			med1.getHitzorduak().inprimatuHitzorduGuztiak();
		} else {
			System.out.println("Ez da existitzen hitzordu hori mediku horrentzat");
		}
	}
}
