package bozovic.milos;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {

	LinkedList<String> ll = new LinkedList<String>();	
	
	ll.add("Jelena");
	ll.add("Marija");
	ll.add("Jovana");
	ll.add("Vanja");
	ll.add("Ivana");
	
	//pristupanje vrednosti elementa iz povezane liste
	Object element = ll.get(0);
	System.out.println("Zatražen element je: " + element);
	
	//postavljanje vrednosti elementa u povezanoj listi
	System.out.println("Povezana lista pre promene: " +ll);
	ll.set(1, "Milos");
	System.out.println("Povezana lista nakon promene: " + ll);
	
	//kreiranje nove liste
	LinkedList<String> ll1 = new LinkedList<String>();
	ll1.add("Uros");
	ll1.add("David");
	ll1.add("Andrija");
	//dodavanje svih elemenata nove liste u staru
	ll.addAll(ll1);
	System.out.println("Povezana lista nakon dodavanja: " + ll);
	
	//brisanje lemenata - od kog do kog, 
	//s tim da se ne briše poslednji element
	ll.subList(6, 7).clear();
	System.out.println("Povezana lista nakon brisanja: " +ll);
	
	ListIterator<String> it1 = ll.listIterator();
	//štampanje od prvog do poslednjeg
	System.out.println("Prikaz od prvog do poslenjeg: ");
	while(it1.hasNext()) {
		System.out.print(it1.next() + " ");
	}
	System.out.println();
	System.out.println("Prikaz od poslednjeg do prvog: ");
	while(it1.hasPrevious()) {
		System.out.print(it1.previous() + " ");
	}
	}

}
