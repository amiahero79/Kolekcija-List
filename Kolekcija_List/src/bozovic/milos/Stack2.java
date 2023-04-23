package bozovic.milos;

import java.util.*;

public class Stack2 {

	public static void main(String[] args) {
		

		// kreiranje objekta klase Stack
		Stack<Integer> stk = new Stack<>();
		System.out.println("stack: " + stk);
		// dodavanje elemenata
		pushelmnt(stk, 20);
		pushelmnt(stk, 13);
		pushelmnt(stk, 89);
		pushelmnt(stk, 90);
		pushelmnt(stk, 11);
		pushelmnt(stk, 45);
		pushelmnt(stk, 18);
		// izbacivanje elemenata
		popelmnt(stk);
		popelmnt(stk);
		// throws Exception ako je stack prazan
		try {
			popelmnt(stk);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}

	// metoda za dodavanje elemenata
	static void pushelmnt(Stack stk, int x) {
		// pokretanje push() metode
		stk.push(new Integer(x));  
		System.out.println("push -> " + x);
		// štampanje izmenjenog stack-a
		System.out.println("stack: " + stk);
	}

	// metoda za izbacivanje elemenata
	static void popelmnt(Stack stk) {
		System.out.print("pop -> ");
		// pokretanje pop() metode
		Integer x = (Integer) stk.pop();
		System.out.println(x);
		// štampanje izmenjenog stack-a
		System.out.println("stack: " + stk);

	}

}
