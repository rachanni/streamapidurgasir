package toarray;

import java.util.ArrayList;

//we can use toArray() method to copy element present in the stream to the specified array.

public class ToArrayMethodDemo {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);
		
		Integer[] arr= list.stream().toArray(Integer [] :: new);
		for(Integer x: arr) {
			System.out.println(x);
		}
	}
}
