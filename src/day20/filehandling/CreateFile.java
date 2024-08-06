package day20.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) throws IOException {
	
	String filename="myfolder/file.txt";
	FileWriter fwriter=new FileWriter(filename);
	//fwriter.write("Welcome to Excelr");
	fwriter.write("In Java, a File is an abstract data type. \nA named location used to store related information is known as a File. \nThere are several File Operations like creating a new File, \ngetting information about File, writing into a File, \nreading from a File and deleting a File.");
	//fwriter.append(" to Excler");
	fwriter.close();
	
	System.out.println("Data Written to file "+ filename);
}
}
