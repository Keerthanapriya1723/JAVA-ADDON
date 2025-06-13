package Day6;

public class ArrayTest {

	public static void main(String[] args) {
//		int[] a ={1,2,3,4,5};//DECLARE ARRAY
////	System.out.println(a[3]);//print array declare
//		 int sum=0;
//	     int count=0;  
//        for(int i=0;i<a.length;i++) {
//        	System.out.println(a[i]);//DECLARE ARRAY IN FOR LOOP
//        	sum+=a[i];
//        	System.out.println("sum:"+sum);
////        	int count=a.length;
//        	count++;
//        	System.out.println("Count:"+count);
//        }
//       
        int[] a ={1,2,3,4,5};//DECLARE ARRAY
//    	System.out.println(a[3]);//print array declare
    		 int sum=0;
    	     int oddcount=0;  
            for(int i=0;i<a.length;i++) {
            	System.out.println(a[i]);//DECLARE ARRAY IN FOR LOOP //print each element
            	sum+=a[i];//add to sum
            	if(a[i] %2 !=0) { //check if odd
            		oddcount++;// increament odd count
            	}
            	}
            	System.out.println("sum:"+sum);
//            	int count=a.length;
            	oddcount++;
            	System.out.println("Count:"+oddcount);
            }
			

	}


