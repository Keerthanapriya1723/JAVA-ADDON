package Day5;
import java.util.ArrayList;
public class Arraylistclass {

	public static void main(String[] args) {
//		int [] arr= new int[5];
		ArrayList<Integer> arr=new ArrayList();
//		accepts all types of values
		ArrayList<Object> arr2=new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		//to iterate the object
		arr.forEach(num->System.out.println(num*num));
		//validate teh voting (age)
		arr.forEach(age->{
			if(age>=18) {
				System.out.println("allowed");
			}
			else {
				System.out.println("Not allowed");
			}
		});
		arr2.add("haii java");
		System.out.println(arr);
		System.out.println(arr2);
	}

}
