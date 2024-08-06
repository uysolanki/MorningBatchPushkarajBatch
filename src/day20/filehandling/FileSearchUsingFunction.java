package day20.filehandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSearchUsingFunction {

	public static void main(String[] args) throws IOException {
		String filename = "myfolder/file.txt";
		
		String word="File";
		int result=searchWordInFile(filename,word);
		if(result==-1)
			System.out.println("Word Not Found");
		else
			System.out.println("Word Found at Index" + result);
}

	private static int searchWordInFile(String filename, String word) throws IOException 
	{
		FileReader fwriter = new FileReader(filename);
		BufferedReader br = new BufferedReader(fwriter);
		String line;
		int index=-1; //assumption not found
		while((line = br.readLine()) != null) 
		{
			index=line.indexOf(word);
			if(index!=-1)
			{
				break;
			}
		}
		return index;
	}
	}
