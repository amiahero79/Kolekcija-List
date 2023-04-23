package bozovic.milos;

import java.util.Vector;

public class Vektor {

	public static void main(String[] args) {

		// kreiranje praznog Vektora
		Vector<Integer> in = new Vector<>();
		
		// dodavanje elemenata u Vektor
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(200);
		in.add(400);
		in.add(500);
		in.add(600);
		in.add(700);
		// štampanje liste 
		System.out.println("Values in vector: " + in);
		
		// remove() metoda briše prvu pojavu zadate vrednosti
		System.out.println("Izbriši prvu pojavu vrednosti 200: " + in.remove((Integer) 200));
		
		// prikaz liste nakon brisanja
		System.out.println("Štampanje liste nakon brisanja: " + in);
		// ukloni element sa indeksom 4
		System.out.println("Brisanja elementa sa indeksom 4: " + in.remove(4));
		System.out.println("Nakon brisanja: " + in);
		// ukloni element
		in.removeElementAt(5);
		// štampanje liste nakon brisanja
		System.out.println("Elementi nakon brisanja: " + in);
		// hashcode vektora
		System.out.println("Hash code of this vector = " + in.hashCode());
		// prikaži element sa zadatim indeksom
		System.out.println("Element sa indeksom 1: " + in.get(1));

	}

}
