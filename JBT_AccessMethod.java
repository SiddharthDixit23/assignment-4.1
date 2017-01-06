package jbt.access.otherpackage;
 
import jbt.access.JBT;
 
/*
 * Here we will learn to access Method with different Access Modifiers from 
 * another class withing same package.
 */
public class JBT_AccessMethod {
 
	public static void main(String[] args) {
		/*
		 * Creating object of class JBT which is in the same package.
		 */
		JBT jbtObject = new JBT();
 
		/*
		 * As Class is visible so all the public method from this class is
		 * visible.
		 */
		jbtObject.publicMethod();
 
		/*
		 * As this class is not in the same package as JBT hence 
		 * default method will not be accessible.
		 * 
		 * Un-commenting below code will give you error like below.
		 * The method defaultMethod() from the type JBT is not visible. 
		 */
		//jbtObject.defaultMethod();
 
		/*
		 * As this class is neither in same package not subclass of JBT hence 
		 * protected method will not be accessible here.
		 * 
		 * Un-commenting below code will give you error like below.
		 * The method protectedMethod() from the type JBT is not visible. 
		 */
		//jbtObject.protectedMethod();
 
		/*
		 * Now if you try to call private method from JBT class compiler will give you error saying that 
		 * "The method privateMethod() from the type JBT is not visible".
		 * Uncomment the below line and see the compiler error. 
		 */
		//jbtObject.privateMethod();
 
	}
}
 