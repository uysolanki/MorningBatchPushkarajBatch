package day10classobject;

public class StaticDriver {

	public static void main(String[] args) {
		Student.displayStrength();  //10
		
		
		Student s1=new Student();    //11
		s1.displayStrength(); //       11
		Student s2=new Student(2,"Ben"); //12
		
		s1.displayStudent();  //1 Rahul
		s2.displayStudent();  //2 Ben
		
		s1.displayStrength(); //12
		s2.displayStrength(); //12
		
	}

}
