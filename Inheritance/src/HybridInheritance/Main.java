package HybridInheritance;

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



		ResearchAssistant ra = new ResearchAssistant();
		ra.name = "John Doe";
		ra.major = "Computer Science";
		ra.researchTopic = "Artificial Intelligence";


		System.out.println("ResearchAssistant Name: " + ra.name);
		System.out.println("Major: " + ra.major);
		System.out.println("Research Topic: " + ra.researchTopic);
		ra.introduce();
		ra.attendLecture();
		ra.conductLecture();
	}

}
