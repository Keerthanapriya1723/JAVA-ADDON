package Day5;
import java.io.*;
public class Filehandling {

	public static void main(String[] args) {
		String filename="textfile/path";
		try(BufferedReader br=new BufferedReader(new FileReader(filename))) {
		 String Line;
		 if((Line= br.readLine()) !=null) {
			 System.out.println(Line);
		 }
			
		}
		catch(Exception e) {
			System.out.println("FileNotFound");
		}
	}

}
