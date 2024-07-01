import java.util.Scanner;

public class StringManipulation {

	static boolean String_Manipulations(String s1, String s2) {
		// String s1=n1,s2=n2;
		StringBuilder temp = new StringBuilder(s2);

		if (s1.length() != s2.length())
			return false;
		else {
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < temp.length(); j++) {
					if (s1.charAt(i) == temp.charAt(j) || temp.charAt(j) == '*' || temp.charAt(j) == '.') {
						temp.deleteCharAt(j);
						break;
					}
				}
			}
			if (temp.length() == 0)
				return true;
			else
				return false;

		}
 }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("S1:");
		String s1 = scan.next();
		System.out.println("S2");
		String s2 = scan.next();
		boolean flag = String_Manipulations(s1, s2);
		System.out.println(flag);
	}

}
