package practice03main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class family {
	String name;
	int age;
	int id;

	public family(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public static void main(String[] args) {

		family a = new family("rajesh", 39, 101);
		family b = new family("rakesh", 39, 201);
		family c = new family("sushama", 39, 301);
		family d = new family("ankita", 29, 401);

		ArrayList<family> al = new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);

		// to sort ArrayList following method is used from Collections class
		Collections.sort(al, new familyNameComparator());

		Iterator<family> itr = al.iterator();
		while (itr.hasNext()) {
			family obj = itr.next();
			System.out.println(obj.name + " " + obj.age + " " + obj.id);

		}
		
		//method to reverse the collection
		Collections.reverse(al);

		Iterator<family> itr01 = al.iterator();
		while (itr01.hasNext()) {
			family obj = itr01.next();
			System.out.println(obj.name + " " + obj.age + " " + obj.id);
		}

	}
}
