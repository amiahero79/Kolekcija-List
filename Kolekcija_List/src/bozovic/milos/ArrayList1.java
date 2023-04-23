package bozovic.milos;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<String>();	
	list.add("Milos");
	list.add("Ana");
	list.add("Pera");
	list.add("Joca");
	
	System.out.println("Broj elemenata niza je: " + list.size());
    
	//logička metoda vraća true ili false u zavisnosti
	//da li se traženi element nalazi u listi
	boolean sadrzi = list.contains("Milos");
	
	if(sadrzi)  {
		System.out.println("Elements se nalazi u listi");
	} else {
		System.out.println("Element se ne nalazi u listi");
	}
	
	//metoda koja vraća element sa zadatim brojem indeksa
	String element = list.get(2);
	
	System.out.println("Element sa indeksom 2 je: " + element);
	
	//metoda vraća indeks prve pojave zadatog elementa kolekcije
	//vratiće -1 ukoliko traženi element ne postoji
	
	int pozicija = list.indexOf("Ana");
	System.out.println("Element je sa indeksom broj: " + pozicija); 
	
	//brisanje bprve pojave zadate vrednosti
	list.remove("Pera");
	for(String s : list)
		System.out.printf("%s ", s);
	
	list.add("Pera");
	System.out.println();
	//clear() - briše sve elemente liste
	// list.clear();
	
	Iterator<String> iter = list.iterator();
	//štampanje elemenata liste
	while(iter.hasNext())
		System.out.print(iter.next() + " ");
	
	System.out.println();
	//toArray - služi za prebacivanje elemenata u niz
	String[] nizString = new String[list.size()];
	list.toArray(nizString);
	for(String p : nizString)
		//štampanje elemenata niza
		System.out.printf( p + " ");
	
	}

}
