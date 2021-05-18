package practica9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args){
		
		// Variable initialization
		CSVReader csvfile = new CSVReader("C:\\Users\\kagman\\Documents\\practica9.csv");
		Student studentA = new Student("Cesar", "1273328");
		Student studentB = new Student("Alex", "1275964");
		Student studentC = new Student("Dani", "1272549");
		
		// add grades to the students
		csvfile.addGrades(studentA, studentB, studentC);
		
		// Calculate the students average
		studentA.average();
		studentB.average();
		studentC.average();
		
		// Print the students information
		System.out.println(studentA.toString());
		System.out.println(studentB.toString());
		System.out.println(studentC.toString());	
		
		// Save the information in file.txt;
		try {
			File file = new File("file.txt");
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(studentA.toString());
			pw.println(studentB.toString());
			pw.println(studentC.toString());
			pw.close();
			
			System.out.println("\nThe file was generated successfully");
		}catch(IOException e) {
			System.out.println("Error: " + e);
		}
	}

}