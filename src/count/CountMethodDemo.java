package count;

import java.util.ArrayList;

//you are given a list containg string object, find number of string object in the list.
public class CountMethodDemo {

	
	public static void main(String[] args) {
		
		ArrayList<String> originalList= new ArrayList<String>();
		originalList.add("Pavan");
		originalList.add("RaviTeja");
		originalList.add("Chiranjeevi");
		originalList.add("Venkatesh");
		originalList.add("Nagarjuna");
		long lengthOfOriginalList = originalList.stream().count();
		System.out.println("Length of original list: "+ lengthOfOriginalList);
		
//		find count of string object having length >= 9
//		so first we have to filter string object having length greater than or
//		equal to 9 then we have to count number of string object in that stream.
		
//		although we can store filtered element in separate list then we can use size() method.
//		but why? if we can directly count number of object in filtered stream.
		long count= originalList.stream().filter(name -> name.length() >= 9).count();
		System.out.println("Number of string object having length greater than or equal to nine: " +count);
		
		
	}
}
