package com.isad;

import java.util.Scanner;

public class Interfazea {
	public static void main(String[] args) {
		
		Ospitala os = new Ospitala();
		os.datuakKargatu();
		System.out.println("------------------------------");
		System.out.println("Datuak Kargatuta");
		System.out.println("------------------------------");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Sartu mediku zenbakia: ");
		int medikuZenb = s.nextInt();
		System.out.println(medikuZenb);
		
		System.out.println("Sartu ezabatu beharreko data YYYY/MM/DD formatuan: ");
		String zeinData = s.next();
		System.out.println(zeinData);
		
		os.medikuBatenZitakEzeztatu(medikuZenb, zeinData);
		
	}
	

}
