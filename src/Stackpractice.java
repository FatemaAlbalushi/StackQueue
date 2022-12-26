import java.util.ArrayList;
import java.util.Stack;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class Stackpractice {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Something";
		String str1 = "{int i=0;}{int x=1 {{}}}";
		String str2 = "{{int x=0;}}}";
		String str3 = "{";
		String str4 = "}";
		String sentence = "Reverse me if you can";
		
		System.out.println("Print the reverse string of " + str);
		reString(str);
		System.out.println();
		System.out.println("Print if there is open barantheses " + countBarn(str1));
		System.out.println("Print if there is open barantheses " + countBarn(str2));
		System.out.println("Print if there is open barantheses " + countBarn(str3));
		System.out.println("Print if there is open barantheses " + countBarn(str4));
		System.out.println("Print the reverse string of: " + sentence);
		SplitString(sentence);

	}

	
	public static void reString(String userString) {

		Stack<Character> mystack = new Stack<Character>();
		for (int index = 0; index < userString.length(); index++) {
			mystack.push(userString.charAt(index));

		}
		while (!mystack.empty()) {
			System.out.print(mystack.pop());

		}
	}

	public static boolean countBarn(String str) {
		Stack<Character> mystack1 = new Stack<Character>();

		for (int index = 0; index < str.length(); index++) {

			if (str.charAt(index) == '{') {
				mystack1.push(str.charAt(index));
			}

			else if (str.charAt(index) == '}') {
				if (mystack1.empty()) {
					return false;

				} else {
					mystack1.pop();
				}

			}

		}
		if (mystack1.empty()) {
			return true;

		} else {
			return false;
		}

	}
	
	
	public static void SplitString(String sentence) {
		
		Stack<String> mystack = new Stack<String>();
		String[] myarr= sentence.split(" ");
	
		for (String word: myarr) {
			  mystack.push(word);
			  

		}
		while (!mystack.empty()) {
		
			System.out.print(mystack.pop()+" ");

		}
		
	}
	
	public static ArrayList<String> ReverseString(String str, char ch) {
		
		
		return null;
		
		
	}

}
