public class Palindrome{

	//todo: Create a method isPalindrome which takes a String as input and returns true if it is a palindrome and false otherwise.
	//A palindrome is a word which can be read backwards and forwards in the same way., e.g. 'hannah'.
	//Ignore upper and lower case. 'Hannah' is a palindrome, too.
	//Ignore also spaces. 'Taco cat' is a valid palindrome.
	public static boolean isPalindrome(String c) {
		String a=c;
		String b="";
		
		for(int i= a.length()-1; i> -1; i--) {
			if(a.charAt(i)!=' ') {
				//a.charAt(i);
				b+=a.charAt(i);
			}
		}
//		System.out.println(b);
//		if(a.equalsIgnoreCase(b)) {
//			return true;
//		}
//		System.out.println(a.replace(" ", ""));
		if(a.replace(" ", "").equalsIgnoreCase(b)) {
			return true;
		}
		return false;
		
	}
	public static void main(String[]args) {
		String c = "Taco cat";
		System.out.println(isPalindrome(c));
		
	}
	
	
	
	
}