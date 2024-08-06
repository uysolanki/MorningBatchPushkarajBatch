package day20.filehandling;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
	File file=new File("myfolder");
	if(!file.exists())
			{
				file.mkdir();
			}

	System.out.println("Folder created");
	}
}
