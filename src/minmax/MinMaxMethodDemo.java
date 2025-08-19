package minmax;

import java.util.ArrayList;

public class MinMaxMethodDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> originalList= new ArrayList<Integer>();
		originalList.add(0);
		originalList.add(10);
		originalList.add(20);
		originalList.add(5);
		originalList.add(15);
		originalList.add(25);
//		originalList.add(null);
		
//		we will get java.lang.NullPointerException in case list contain null object.
		System.out.println("Original list: "+originalList);
		
//		find min element in the list
		Integer min= originalList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		
//		what happen if we pass the comparator to sort descending order?
//		Integer min= originalList.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println("min element in list: "+ min);
		
		Integer max= originalList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("max element in the list: "+max);
	}
}
