package MultiLevelInheritance;

public class Employee extends Person {
	// Additional attributes
    String department;
    
    
    void work() 
    {
        System.out.println(name + " is working.");
    }
}
