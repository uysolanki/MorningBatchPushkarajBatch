package day16solid.srpsolution;

public class StringManipulator {
	public String name;
	
	public StringManipulator() {}
	
	public StringManipulator(String k)
	{
		this.name=k;
	}
	
	public void getMiddleString()
	{
		this.name=name.substring(9, 14);
	}
	
	public void modifyString(String newName,String oldName)
	{
		this.name=name.replace(oldName, newName);
	}
}
