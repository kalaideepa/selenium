import java.util.Scanner;

public class Basics1 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		
		char vowels[]= {'a','e','i','o','u'};
		
		for(int i=0;i<text.length();i++) {
			
			for(int j=0;j<vowels.length;j++) {
				
				if(text.charAt(i)==vowels[j]) {
					System.out.print(text.charAt(i)+" ");
				}
			}
		}
  }

  }
