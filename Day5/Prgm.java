package Day5;

//                              EXCEPTION

//                             (try,catch)

//public class Prgm {
//
//	public static void main(String[] args) {
//		try {
//		int[] myNumber= {1,2,3};
//		System.out.println(myNumber[10]);
//		}
//		catch(Exception e) {
//			System.out.println("error cleared");
//		}
//			
//		}
//		}
//

//                               (try,catch,finally)

public class Prgm {

	public static void main(String[] args) {
		try {
		int[] myNumber= {1,2,3};
		System.out.println(myNumber[10]);
		}
		catch(Exception e) {
			System.out.println("error cleared");
		}
			finally {
				System.out.println("The'try catch' is finished");
			}
		
		}
		}
