//program from Durga Sir video no. 35
//program part 01
package DurgaPack01;

import java.util.TreeSet;

public class Practice01 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new MyComparator01());
		ts.add("ram");
		ts.add("sham");
		ts.add("lam");
		ts.add("bham");
		ts.add("gram");
		
		System.out.println(ts);
		
		
	}
	
	

}
