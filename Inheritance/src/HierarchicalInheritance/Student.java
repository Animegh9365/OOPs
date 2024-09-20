package HierarchicalInheritance;

public class Student extends Person {
	// Additional attributes
    String major;
    
    void attendLecture() 
    {
        System.out.println(name + " is attending a lecture.");
    }
    
}
