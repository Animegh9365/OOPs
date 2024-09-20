
public class ParentChildMain {
	public static void main(String[] args) {
		//Creating the object of child class
		ChildClass c1 = new ChildClass();
		
		// Assigning the name variable with the reference c1 using dot operator
		c1.name = "Child";
		System.out.println("The name of the child is: " + c1.name);
		// Calling the display() that is inherited in the child class
		c1.display();
	}
}
