package foreach;

import java.util.ArrayList;

//forEach() method 
public class ForEachDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("A");
		list.add("BB");
		list.add("CCC");
		
//		using forEach() method
//		forEach() -> argument -> Consumer -> Lambda expression
		list.stream().forEach(s -> System.out.println(s));
		
//		if we want we can use also refer println method defined in System class
		list.stream().forEach(System.out :: println);
		
	}
}
