package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//an array is given find the element from it.
public class EvenElementFromArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		System.out.println("Original array: "+l);
		
//		need to filter only even element
		List<Integer> evenElementList= l.stream().filter(num -> num%2 ==0).collect(Collectors.toList());
		System.out.println("Only even element: "+evenElementList);
		
//		multiply with 2 in every element
//		In this case we need to use map
		List<Integer> eachElementMultiplyBy2List= l.stream().map(num -> num *2).collect(Collectors.toList());
		System.out.println("Each element multiply by 2 list: "+eachElementMultiplyBy2List);
	}
}
