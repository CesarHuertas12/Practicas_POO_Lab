package practica9;

import java.io.BufferedReader;
import java.io.FileReader;


public class CSVReader {
	
	public CSVReader(String fileName) {
		readFile(fileName);
		dataChange();
	}
	
	BufferedReader reader;
	String line;
	String[] data = null;
	int[] dataInt = new int[21];
	
	public void readFile(String fileName) {
		try {
			reader = new BufferedReader(new FileReader(fileName));
			while((line = reader.readLine()) != null) {
				data = line.split(",");
				System.out.println();
			}
			reader.close();
			line = null;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void dataChange() {
		dataInt[0] = 67;
		for(int i=1 ; i < data.length; i++) {
			dataInt[i] = Integer.parseInt(data[i]);
			
		}
	}
	
	public void addGrades(Student studentA, Student studentB, Student studentC) {
		int aux = 0;
		
		for(int i=0; i < dataInt.length; i++) {
			if(i < 7) {
				studentA.grades[aux] = dataInt[i];
				aux++;
			}
			else if(i >= 7 && i < 14) {
				if(aux == 7) {aux = 0;}
				studentB.grades[aux] = dataInt[i];
				aux++;
			}
			else if(i >= 14 && i < 21) {
				if(aux == 7) {aux = 0;}
				studentC.grades[aux] = dataInt[i];
				aux++;
			}
		}
	}
}
