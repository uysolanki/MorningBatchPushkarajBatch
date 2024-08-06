package day20.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadSingleLine {
public static void main(String[] args) throws IOException,FileNotFoundException {
	String filename="myfolder/file.txt";
	FileReader fwriter=new FileReader(filename);
	
	BufferedReader br=new BufferedReader(fwriter);
	String line=br.readLine();
	System.out.println(line);
	
	br.close();
	fwriter.close();
}
}
