package day25.colletionday4.setinterface;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>
{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getAge() > p2.getAge())
			return 1;
			else if(p1.getAge() < p2.getAge())
			return -1;
			else
			return 0;
	}

}
