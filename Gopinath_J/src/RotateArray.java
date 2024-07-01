import java.util.Scanner;

public class RotateArray { 
      
	static void rotateMatrix(int[] arr,int s) {
          int n=arr.length;
          int k=s%n;
          for(int i=0;i<n;i++) {
        	  if(i<k) {
        		  System.out.print(arr[i+n-k]+" ");
        	  }
        	  else
        		  System.out.print(arr[i-k]+" ");
          }
   }

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements:");
		int length = scan.nextInt();
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("How many rotations:");
		int k = scan.nextInt();
		rotateMatrix(arr,k);
  }
 
	
 }
		
	
 


