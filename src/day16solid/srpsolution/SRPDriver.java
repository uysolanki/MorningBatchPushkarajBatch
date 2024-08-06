package day16solid.srpsolution;

public class SRPDriver {

	public static void main(String[] args) {
		StringManipulator sm=new StringManipulator("Mahendra Singh Dhoni");
		
		StringDisplayer sd=new StringDisplayer(sm);
		sd.displayName();
		sd.displayNameLowerCase();
		sd.displayNameUpperCase();
		sd.displayNameWithStars();
		System.out.println();
		sd.displayIndividualWords();
		sd.displayName();
		
		

	}

}
