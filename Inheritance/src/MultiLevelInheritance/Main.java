package MultiLevelInheritance;

public class Main {
	public static void main(String[] args) {
		 // Create and instantiate Manager object
	    Manager manager = new Manager();
	    manager.id = 1;
	    manager.name = "Alice Johnson";
	    manager.department = "Management";
	    manager.teamSize = 5;
	    
	    // Access and print Manager attributes and behaviors
	    System.out.println("Manager ID: " + manager.id);
	    System.out.println("Manager Name: " + manager.name);
	    System.out.println("Department: " + manager.department);
	    System.out.println("Team Size: " + manager.teamSize);
	    manager.introduce();
	    manager.work();
	    manager.conductMeeting();
	}
}
