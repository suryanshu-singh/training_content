package start;
import java.util.Scanner;


public class Starter {
	public class Trying{
		int number;
		String s="";
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getS() {
			return s;
		}
		public void setS(String s) {
			this.s = s;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("This is amazing");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		Starter s = new Starter();
		Starter.Trying t=s.new Trying();
		t.setNumber(scan.nextInt());
		System.out.println(t.getNumber());
				
		

	}

}
