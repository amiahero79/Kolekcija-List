package bozovic.milos;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {
	
		Stack<String> stk= new Stack<>();  
		// ubacivanje elemenata u Stack  
		stk.push("Jabuka");  
		stk.push("Grožđe");  
		stk.push("Mango");  
		stk.push("Pomorandža");  
		System.out.println("Stack: " + stk);  
		// pristup elemntima od poslednjeg ka prvom  
		String voce = stk.peek();  
		//štampanje stack-a  
		System.out.println("Poslednji element: " + voce); 	

	}

}
