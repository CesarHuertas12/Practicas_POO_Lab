package practica9;

public class Student {
	
	String name;
	String enrollment;
	String gradesWord = new String();
	int[] grades = new int[7];
	float aver = 0;
	
	public Student(String name, String enrollment) {
		this.name = name;
		this.enrollment = enrollment;
	}
	
	private void concatenateGrades() {
		for(int i=0; i < grades.length; i++) {
			gradesWord += "["  + grades[i] + "] ";
		}
	}
	
	public void printGrades() {
		System.out.print("Grades: ");
		for(int i=0; i < grades.length; i++) {
			System.out.print("["  + grades[i] + "] ");
		}
		System.out.println();
	}
	
	public void average() {
		for(int i = 0 ; i < grades.length; i ++) {
			aver += grades[i];
		}
		aver /= grades.length;
		concatenateGrades();
	}
	
	public String toString() {
		return "Student Data: [Name: " + name + ", Enrollment: " + enrollment + ", Grades: "+ gradesWord + ", Average: " + aver + "]";
	}
}
