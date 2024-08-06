package day20.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByByteStream {
public static void main(String[] args) throws IOException,FileNotFoundException {
	String filename = "myfolder/file.txt";
	FileInputStream fis=new FileInputStream(filename);
	int charCounter=0;
	int lineCounter=0;
	int wordCounter=0;
	int n;
	n=fis.read(); //A ascii value A=65 
	while(n!=-1)
	{
		charCounter++;
		if(n==10)
		lineCounter++;
		if(n==32 || n==10)
		wordCounter++;
		
		System.out.print((char)n);   //65
		n=fis.read();
		
	}
	
	System.out.println("\nFile Char Count "+charCounter);
	System.out.println("File Line Count "+ (lineCounter+1));
	System.out.println("File Line Count "+ (wordCounter+1));
}
}
