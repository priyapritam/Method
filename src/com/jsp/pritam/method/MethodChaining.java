package com.jsp.pritam.method;

public class MethodChaining {

	//Calling Method
	void eatFood() {
		washHands();
		serveFood();

		System.out.println("Eating Food!!");
		washHands();
	}

	//Called Method
	void serveFood() {
		System.out.println("Wash Hands");
	}

	//	Called Method
	void washHands() {
		System.out.println("Serve Food");
	}
}

/* Method calling rules ->
 * A method of a class can call the other method of same class just by its name.(Object not required).
 * 
 */











