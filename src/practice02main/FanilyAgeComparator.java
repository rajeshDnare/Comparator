package practice02main;

import java.util.Comparator;

public class FanilyAgeComparator implements Comparator<family> {

	@Override
	public int compare(family o1, family o2) {
		if (o1.age < o2.age)
			return -1;
		else if (o1.age > o2.age)
			return 1;
		else
			return 0;
	}

}
