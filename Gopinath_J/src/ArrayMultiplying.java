import java.util.Scanner;

public class ArrayMultiplying {
	
	   static boolean EqualNumbers(int[] a,int n) {
		  for(int i=0;i<n;i++) {
				 while(a[i]%2==0) {
					 a[i]/=2;
				 } 
				 while(a[i]%3==0){
					 a[i]/=3;
				} 
				if(a[i]!=a[0]) {
					return false;
				}
			 } return true;
	   }
	 public static void main(String args[]) { 
		 int a[]= {50,75,150}; int n = a.length;
		 System.out.println(EqualNumbers(a,n));
		 
	 }

  }
