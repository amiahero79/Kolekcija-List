package bozovic.milos;

import java.util.Iterator;
import java.util.Stack;

public class Stack4 {

	public static void main(String[] args) {

		Stack<String> stk= new Stack<>();  
		//dodavanje elemenata u Stack  
		stk.push("Mac Book");  
		stk.push("HP");  
		stk.push("DELL");  
		stk.push("Asus");  
		System.out.println("Stack: " + stk);  
		//pretraga elementa  
		int lokacija = stk.search("HP");  
		System.out.println("Indeks elementa koji ima podatak Dell je: " + lokacija);  	
		
		// Proveravamo da li je stack prazan  
		boolean rslt=stk.empty();  
		System.out.println("Da li je prazan? " + rslt);  
		// Veličina Stack-a  
		int x=stk.size();  
		System.out.println("Broj elemenata stack-a je: "+ x);  
		
		//iterator u stack-u  
		Iterator iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
		Object values = iterator.next();  
		System.out.print(values + " ");  
		}
		
		
	}

}
