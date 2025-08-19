package sorted;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//you have given a list containing Integer object.
//need to sort then

public class SortedMethodDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> originalList= new ArrayList<Integer>();
		originalList.add(0);
		originalList.add(10);
		originalList.add(20);
		originalList.add(5);
		originalList.add(15);
		originalList.add(25);
		System.out.println("Original list without sorting: "+originalList);
		
//		sort based default natural sorting order or ascending order
		List<Integer> ascendingOrderSorting= originalList.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order sorting: "+ascendingOrderSorting);
		
//		sort descending order
//		you have to pass comparator in sorted() method.
		List<Integer> descendingOrderSorting= originalList.stream().sorted((integer1, integer2) -> -integer1.compareTo(integer2)).collect(Collectors.toList());
		System.out.println("Descending order sorting: "+descendingOrderSorting);
	}
}
