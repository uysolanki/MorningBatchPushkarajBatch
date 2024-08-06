package day20.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		String filename = "myfolder/file2.dat";
		FileOutputStream fos=new FileOutputStream(filename);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Person person=new Person(1,"Alice",23);
		oos.writeObject(person);
		
		System.out.println("Object Written to File");

	}

}
