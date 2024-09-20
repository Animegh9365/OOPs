package HierarchicalInheritance;

public class Professor extends Person {
	// Additional attributes
    String department;
    
    void conductLecture() 
    {
        System.out.println(name + " is conducting a lecture.");
    }
    
}
