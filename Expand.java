import java.util.Scanner;

//advanced

public class Expand {
	//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
			//expand the String by printing each letter so many times as the number before the letter indicates
			//e.g. 2a3b5c -> aabbbccccc
			//Hint: first start with inputs where there is always a number and then a character, then think about how
			//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
			//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
			//e.g. a3b12cd5e -> abbbccccccccccccdeeeee
	
	public static void main(String[] args) {
		String a = "15a3bc";
		System.out.println(isExpand(a));
		
	}
	public static String isExpand(String a) {
		String c ="";
		String temp ="0";
		for(int i=0; i<a.length();i++) {
			char cheesecake =a.charAt(i);
			if(Character.isDigit(cheesecake)) {
				temp += cheesecake;				
			}
			else {
				int n = Integer.parseInt(temp);
				if(n==0) {
					c += a.charAt(i);
				}else {
				for (int j=0; j<n; j++) {
					c+=a.charAt(i);
				}
			
				temp="0";
			}
				
		}
			
	}
		return c;
		
	}
	
}
