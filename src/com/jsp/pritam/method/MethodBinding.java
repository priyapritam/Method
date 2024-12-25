package com.jsp.pritam.method;

public class MethodBinding {

	/* Method Binding ->
	 * Method binding is the process of attaching the method definition or the body to its method call.
	 */
	
	// Method Declaration
	void sleep()
	{
		// Method Implementation
		System.out.println("Sleeping");
	}
	public static void main(String[] args) {
		
		// Object Creation
		MethodBinding mb = new MethodBinding();
		
		// Method Call or Invocation
		mb.sleep();
	}
}
