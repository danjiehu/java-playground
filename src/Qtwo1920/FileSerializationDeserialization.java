package Qtwo1920;

import java.io.*;
import java.util.*;

public class FileSerializationDeserialization implements SerializationHandler<Person> {

	public FileSerializationDeserialization(){
		// do nothing;
	}
	
	public void serialise(List<Person> pl) {
		
		try {

			FileOutputStream filestream = new FileOutputStream("src/Qtwo1920/personList.dat");
			
			ObjectOutputStream os = new ObjectOutputStream(filestream);
			
			os.writeObject(pl);
			
			os.close();
			
			System.out.printf("\nlist serialized \n");
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	public List<Person> deserialise(){
		
		try {
			FileInputStream filestream = new FileInputStream("src/Qtwo1920/personList.dat");
			
			ObjectInputStream os = new ObjectInputStream(filestream);
			
			@SuppressWarnings("unchecked")
			List<Person> pl = (List<Person>)os.readObject();
			
			os.close();
			
			return pl;
		}
		catch(Exception e) {
			
			e.printStackTrace();
			List<Person> empty = new ArrayList<Person>();
			return empty;
			
		}
	}
	
}
