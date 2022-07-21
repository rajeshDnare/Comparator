package practice02main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class family {
	String name;
	int age;

	public family(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		family a = new family("rajesh", 29);
		family b = new family("rakesh", 19);
		family c = new family("sushama", 59);
		family d = new family("ankita", 49);
		//pass object of comparator to collection as argument
		//we can have multiple comparator classes which compare base on diff parameters
		//we just need to pass the object of that comparator to the TreeSet to compare
		TreeSet<family> al = new TreeSet<>(new FanilyAgeComparator());
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		
		Iterator<family> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().name);
		}
	}

}
