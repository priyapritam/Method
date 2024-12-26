package com.jsp.pritam.method;

public abstract class MethodOverriding {
	
	abstract void order();
}

class Amazon extends MethodOverriding{
	
	@Override // Annotation
	void order() {
		System.out.println("Ordered Laptop");
	}
}

class Flipkart extends Amazon{
	
	@Override // Annotation
	void order() {
		System.out.println("Ordered Mobile");
	}
}

/*
 * Method Overriding Rules -
 * --------------------------
 * 1.	Method must be inherited.
 * 2.	Method must be a non-static method and non-final method.
 * 3.	Method return type must be same.
 * 4.	Method name must be same.
 * 5.	Method signature must be same.
 * 6.	Access modifier must be same or higher visibility.
 */