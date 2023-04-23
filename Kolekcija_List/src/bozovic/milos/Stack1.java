package bozovic.milos;

import java.util.*;

public class Stack1 {

	public static void main(String[] args) {

		// kreiranje istance klase Stack
		Stack<Integer> stk = new Stack<>();
		// proveravamo da li je prazan
		boolean result = stk.empty();
		System.out.println("Da li je prazan? " + result);
		// dodavanje elemenata u stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		
		// štampanje elemenata
		System.out.println("Štampanje elemenata : " + stk);
		result = stk.empty();
		System.out.println("Da li je stack prazan? " + result);
		
	
		

	}

}
