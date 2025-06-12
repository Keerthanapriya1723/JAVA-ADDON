package Day6;

import java.util.ArrayList;

public class ArraryLists {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("A");
		arr.add("Computer Science");
		arr.add("3 year");                                                                                                      
		arr.add(0,"keerthana");
		arr.set(2, "Karadi");
		System.out.println(arr.get(1));
		for(Object data:arr) {
			System.out.println(data);
		}
		
	}

}
