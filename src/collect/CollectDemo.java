package collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//you are given an arraylist containing string object, you need to collect 
//string object having length greater than or equal to 9
public class CollectDemo {

	public static void main(String[] args) {
		
		ArrayList<String> originalList= new ArrayList<String>();
		originalList.add("Pavan");
		originalList.add("RaviTeja");
		originalList.add("Chiranjeevi");
		originalList.add("Venkatesh");
		originalList.add("Nagarjuna");
		System.out.println("Original list: "+originalList);
//		
		List<String> lengthGreaterThan9= originalList.stream().filter(name -> name.length() >= 9).collect(Collectors.toList());
		System.out.println("List containing string object length greater than or equal to 9: "+ lengthGreaterThan9);
		
//		change every string object to upper case
		List<String> upperCaseStringObject= originalList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println("Upper case string object: "+upperCaseStringObject);
		
	}
}
