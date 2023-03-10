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
		String str1 = "{ int x= (int)(0+1); int[] arr=new arr[10];;; }";
		String str2 = "[{()}]";
		String str3 = "]{()}[";
		String str4 = "([](";
		String str5 = "(arr[10})";
		String str6 = "[arr(10)[";
		String str7 = "([arr{(10)}])";
		String sentence = "Reverse me if you can";
		String sen = "NomberOfSeats";
		
		System.out.println("Print the reverse string of " + str);
		reString(str);
		System.out.println();
		System.out.println();
		System.out.println("Print the validation of the string");
		System.out.println("Valid: " + str1 + " " + countBarn(str1));
		System.out.println("Valid: " + str2 + " " + countBarn(str2));
		System.out.println("Valid: " + str3 + " " + countBarn(str3));
		System.out.println("Valid: " + str4 + " " + countBarn(str4));
		System.out.println("Valid: " + str5 + " " + countBarn(str5));
		System.out.println("Valid: " + str6 + " " + countBarn(str6));
		System.out.println("Valid: " + str7 + " " + countBarn(str7));
		System.out.println();  
		System.out.println("Print the reverse string of: " + sentence);
		RevString(sentence);
		System.out.println();
		System.out.println("Print the split string of: " + sentence);
		Split(sentence, ' ');
		
		System.out.println();
		System.out.println("Print the split string of: " + sen);
		SplitByChar(sen);
		
		System.out.println();
		System.out.println();
		System.out.println("Print the split string of: " + sentence);
		RevStringSplit(sentence);
		

	}

	/**
	 * 
	 * @param userString reverse sentence using string
	 */
	public static void reString(String userString) {
		Stack<Character> mystack = new Stack<Character>();
		for (int index = 0; index < userString.length(); index++) {
			mystack.push(userString.charAt(index));

		}
		while (!mystack.empty()) {
			System.out.print(mystack.pop());

		}
	}

	/**
	 * 
	 * @param str
	 * @return if the brackets is valid or not
	 */
	public static boolean countBarn(String str) {
		Stack<Character> mystack1 = new Stack<Character>();

		for (int index = 0; index < str.length(); index++) {
			for (int index1 = 0; index1 < str.length(); index1++) {

				if (str.charAt(index1) == '{') {
					mystack1.push(str.charAt(index1));
				}

				else if (str.charAt(index1) == '}') {
					if (mystack1.empty()) {
						return false;

					} else {
						mystack1.pop();
					}

				}
			}

			for (int index2 = 0; index2 < str.length(); index2++) {

				if (str.charAt(index2) == '(') {
					mystack1.push(str.charAt(index2));
				} else if (str.charAt(index2) == ')') {
					if (mystack1.empty()) {
						return false;

					} else {
						mystack1.pop();
					}

				}
			}

			for (int index3 = 0; index3 < str.length(); index3++) {
				if (str.charAt(index3) == '[') {
					mystack1.push(str.charAt(index3));
				}

				else if (str.charAt(index3) == ']') {
					if (mystack1.empty()) {
						return false;

					} else {
						mystack1.pop();
					}

				}
			}

		}
		if (mystack1.empty()) {
			return true;

		} else {
			return false;
		}

	}

	/**
	 * 
	 * @param sentence 
	 * print the reverse string using .split with spase
	 */

	public static void RevString(String sentence) {
		Stack<String> mystack = new Stack<String>();
		String[] myarr = sentence.split(" ");
		
		//ArrayList<String> myarr = Split(sentence, ' ');

		for (String word : myarr) {
			mystack.push(word);
		}
		while (!mystack.empty()) {

			System.out.print(mystack.pop() + " ");

		}

	}
	
	/**
	 * 
	 * @param sentence 
	 * print the reverse string using .split with uppercase
	 */

	public static void SplitByChar(String sentence) {
		Stack<String> mystack = new Stack<String>();
		String[] myarr = sentence.split("(?=[A-Z])");

		for (String word : myarr) {
			mystack.push(word);
		}
		while (!mystack.empty()) {

			System.out.print(mystack.pop() + " ");

		}

	}

	/**
	 * 
	 * @param str:
	 * @param ch:
	 * @return the split sentence without using split method(impliminting the split method)
	 */
	
	public static ArrayList<String> Split(String str, char ch) {
		ArrayList<String> arraylist1 = new ArrayList<>();
		char[] charstr = str.toCharArray();
		String wordString = "";

		for (int i = 0; i < charstr.length; i++) {
			wordString = wordString + charstr[i];
			if (charstr[i] == ch || i == charstr.length - 1) {
				arraylist1.add(wordString);
				wordString = "";
			}
		}
		return arraylist1;
	}
	
	
	/**
	 * 
	 * @param sentence: 
	 * print the reverse sentence
	 */
	public static void RevStringSplit(String sentence) {
		Stack<String> mystack = new Stack<String>();
		ArrayList<String> myarr = Split(sentence, ' ');

		for (String word : myarr) {
			mystack.push(word);
		}
		while (!mystack.empty()) {

			System.out.print(mystack.pop() + " ");

		}

	}
	

}
