package Day6;
import java.util.HashMap;
import java.util.Map;

public class EmailProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> studentMarks=new HashMap();
		studentMarks.put("john",100 );
		studentMarks.put("gowri", 100);
		studentMarks.put("pavi", 100);
		int totalMarks=0;
		for(int marks:studentMarks.values()) {
			totalMarks +=marks;
			
		}
//			System.out.println(totalMarks);
//			to find AVERAGE
		System.out.println("Student Total Marks:"+totalMarks);
        double average=totalMarks/studentMarks.size();
        System.out.println("Student Average Mark:"+average);
       
		for(Map.Entry<String,Integer> entry: studentMarks.entrySet()){
        	System.out.println(entry.getKey( )+" "+entry.getValue());
        }
	}

}
