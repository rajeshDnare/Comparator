//program from Durga Sir video no. 35
//program part 02

package DurgaPack01;

import java.util.Comparator;

public class MyComparator01 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String)o1; 
		String s2=(String)o2; 
//		return s1.compareTo(s2); //ascending
//		return s2.compareTo(s1); //descending
//		return -s1.compareTo(s2); //descending
//		return -s2.compareTo(s1); //ascending
//		return +1; //as per insertion order
//		return -1; //reverse of insertion order
		return 0; //only first element get added
	}

}
