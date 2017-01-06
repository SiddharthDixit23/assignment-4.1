package jbt.access;
 
/*
 * We will try to access the method(With DIfferent Access Modifiers) in this class from Other classes.
 *  
 */
public class JBT {
 
	/*
	 * This method can be accessed from classes within the same package.
	 */
	void defaultMethod() {
		System.out.println("Inside Method with DEFAULT Access Modifier");
	}
 
	/*
	 * This method can be accessed from any class in Java world depend on the
	 * visibility of CLASS.
	 */
	public void publicMethod() {
		System.out.println("Inside Method with PUBIC Access Modifier");
	}
 
	/*
	 * This method can not be accessed from outside of class.
	 */
	private void privateMethod() {
		System.out.println("Inside Method with PRIVATE Access Modifier");
	}
 
	/*
	 * This method can be accessed withing same package and subclass in any
	 * package.
	 */
	protected void protectedMethod() {
		System.out.println("Inside Method with PROTECTED Modifier");
	}
 
}
 