package practice02main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class familyNameComparator implements Comparator<family> {

	@Override
	public int compare(family o1, family o2) {
		// TODO Auto-generated method stub
		return -(o1.name.compareTo(o2.name));
	}

}
