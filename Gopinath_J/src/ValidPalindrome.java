public class ValidPalindrome {

	static boolean IsValidPalindrome() {

		String original = "A Man, a plan,a Canal: Panama";
		String s1 = original.toLowerCase().replaceAll("[^A-Za-z]", "");
		StringBuilder temp = new StringBuilder(s1);
		StringBuilder n = temp.reverse();
		String s2 = n.toString();
		if (s1.equals(s2))
			return true;
		else
			return false;

	}

	public static void main(String args[]) {

		boolean flag = IsValidPalindrome(); // A Man, a plan,a Canal: Panama
		System.out.println(flag);
	}
}
