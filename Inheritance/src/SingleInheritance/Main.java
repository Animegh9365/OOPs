package SingleInheritance;

public class Main {

	public static void main(String[] args) {
		// Creating car object
		Car car1 = new Car();
		/* Car object will have access to the carType variable and startEngine() method
		 as Car class is inheriting Vehicle class 
		 */
		System.out.println(car1.carType + " with " + car1.wheels + " wheels");

		car1.startEngine();
		car1.move();

	}

}
