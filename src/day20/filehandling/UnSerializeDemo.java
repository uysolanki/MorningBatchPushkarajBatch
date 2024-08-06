package day20.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String filename = "myfolder/file2.dat";
		FileInputStream fis=new FileInputStream(filename);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person person=(Person)ois.readObject();
		System.out.println(person);

	}

}
