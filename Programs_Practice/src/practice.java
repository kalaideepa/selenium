import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class practice {
	
	static int  n1=0, n2=1,n3;

	public static void fibonacci(int count) {
		
		if(count>0) {
			n3=n1+n2;
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
			
			fibonacci(count-1);
		}
		
		
		
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count=scan.nextInt();
		//int count=10;
		System.out.print(n1+" "+n2);
		fibonacci(count-2);

	}
}
