package Day6;
import java.util.Scanner; 
//                         Scanner (get input)
public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		String a=s.nextLine();
		System.out.println("Enter commerce mark:");
		int b=s.nextInt();
		System.out.println("enter accontancy mark:");
		int c=s.nextInt();
		System.out.println("Enter english mark:");
		int d=s.nextInt();
//		System.out.println("total Mark:"+(b+c+d));
		int total=b+c+d;
		System.out.println("total mark:"+total);
		//System.out.println("average:"+(b+c+d)/3);
		int sum;
		sum=total/3; //AVERAGE TOTAL
		System.out.println("average:"+sum);

	}

}
