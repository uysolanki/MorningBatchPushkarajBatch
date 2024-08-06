package day16solid.srpsolution;

public class StringDisplayer {

	StringManipulator stringManip;
	
	public StringDisplayer() {}
	public StringDisplayer(StringManipulator k)
	{
		this.stringManip=k;
	}
	
	public void displayName() {
		System.out.println(this.stringManip.name);
	}
	
	public void displayNameLowerCase() {
		System.out.println(this.stringManip.name.toLowerCase());
	}
	
	public void displayNameUpperCase() {
		System.out.println(this.stringManip.name.toUpperCase());
	}
	
	public void displayNameWithStars() {
		for(char c:this.stringManip.name.toCharArray())
		{
			if(c==' ')
			{
				System.out.print("$");
			}
			else
			{
				System.out.print(c);
			}
		}
	}
	public void  displayIndividualWords()
	{
		String arr[] =this.stringManip.name.split(" ");
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
	
}
