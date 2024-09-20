package HybridInheritance;

public class Student extends Person {
	String major;
    
    void attendLecture() 
    {
        System.out.println(name + " is attending a lecture.");
    }
}
