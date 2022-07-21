package practice04;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class MainClass implements Comparator<MainClass> {
	String name;
	int age;

	public MainClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MainClass a = new MainClass("yogesh", 45);
		MainClass b = new MainClass("akash", 35);
		MainClass c = new MainClass("himesh", 65);
		MainClass d = new MainClass("kalpesh", 75);

		LinkedList<MainClass> list = new LinkedList();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);

		Collections.sort(list, new MainClass());

		Iterator<MainClass> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().name);
		}
		
		TreeSet<MainClass> ts=new TreeSet(new MainClass());
		ts.add(a);
		ts.add(b);
		ts.add(c);
		ts.add(d);
		
		Iterator<MainClass> itr01 = ts.iterator();
		while (itr01.hasNext()) {
			System.out.println(itr01.next().name);
		}
	}

	@Override
	public int compare(MainClass o1, MainClass o2) {
		// TODO Auto-generated method stub
		if(o1.age<o2.age)
			return -1;
		else if(o1.age>o2.age)
			return 1;
		else
			return 0;
	}
	


}
