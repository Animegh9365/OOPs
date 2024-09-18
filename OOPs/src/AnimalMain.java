class Animal {
	String animal = "Tiger";
	void eat() {
		System.out.println("Tiger is eating meat");
	}
}

/* Usually It is a good practice to create the main class in a seperate file
 * But for understanding I created the Animal class in the same class
 * While executing the code the file name should be the name of the Main class
 * For me it is AnimalMain so I created the file name as AnimalMain.java
 * 
*/
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger = new Animal();
		tiger.eat();

	}

}
