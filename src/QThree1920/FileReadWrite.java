package QThree1920;

import java.io.*;
import java.util.*;

public class FileReadWrite {

	// constructor
	public FileReadWrite(){
		// do nothing
	}
	
	// methods
	public void writeToFile(List<Employee> empList) {
		try {
			FileWriter fw = new FileWriter("src/Qthree1920/empList.txt");
			
			BufferedWriter writer = new BufferedWriter(fw);
			
			writer.write("Employee List: \n");
			
			for (Employee e : empList) {
				writer.write(e.toString() + "\n");
			}
			
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void readFromFile() {
		try {
			
			FileReader fr = new FileReader("src/Qthree1920/empList.txt");
			
			BufferedReader reader = new BufferedReader(fr);
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
