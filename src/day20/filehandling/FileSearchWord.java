package day20.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSearchWord {

	public static void main(String[] args) throws IOException {
		String filename = "myfolder/abc.txt";
		FileReader fwriter = new FileReader(filename);
		String word="information1";
		
		BufferedReader br = new BufferedReader(fwriter);
		String line;
		int flag=0;
		while ((line = br.readLine()) != null) 
		{
			if(line.indexOf(word)!=-1)
			{
				System.out.println("Word Found");
				flag=1;
				break;
			}
		}

		if(flag==0)
			System.out.println("Word Not Found");
	}

}
