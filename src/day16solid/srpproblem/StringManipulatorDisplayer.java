package day16solid.srpproblem;

public class StringManipulatorDisplayer {

	public String name;
	
	public StringManipulatorDisplayer() {}
	
	public StringManipulatorDisplayer(String name)
	{
		this.name=name;
	}

	public void displayName() {
		System.out.println(this.name);
		
	}
	
	public void getSubString()
	{
		this.name=name.substring(9, 14);
	}
	
	public void modifyString(String newName,String oldName)
	{
		this.name=name.replace(oldName, newName);
	}
	
}
