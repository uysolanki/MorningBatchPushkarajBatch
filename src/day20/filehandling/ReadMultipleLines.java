package day20.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLines {
	public static void main(String[] args) throws IOException {
		String filename = "myfolder/file.txt";
		FileReader fwriter = new FileReader(filename);

		BufferedReader br = new BufferedReader(fwriter);
		String line;

		while ((line = br.readLine()) != null) 
		{
			System.out.println(line);
		}
	}
}
