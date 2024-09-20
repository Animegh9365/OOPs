package HierarchicalInheritance;

public class Main {

	public static void main(String[] args) {
		Professor professor = new Professor();
	    professor.name = "Harish Pathak";
	    professor.department = "Computer Science";
	    
	    System.out.println("Professor Name: " + professor.name);
	    System.out.println("Department: " + professor.department);
	    professor.introduce();
	    professor.conductLecture();
	    

	    Student student = new Student();
	    
	    student.name = "Priya Sharma";
	    student.major = "Computer Science";
	    
	    System.out.println("Student Name: " + student.name);
	    System.out.println("Major: " + student.major);
	    student.introduce();
	    student.attendLecture();
	}

}
