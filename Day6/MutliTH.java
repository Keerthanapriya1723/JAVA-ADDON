package Day6;

public class MutliTH extends Thread {
	private String name;
	
	MutliTH(String name){
		this.name=name;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
class Execute{
	public static void main(String[] args) {
		MutliTH m1=new MutliTH ("Thread 1");
		MutliTH m2=new MutliTH("Thread 2");
		m1.start();
		m2.start();
	

	}

}
}