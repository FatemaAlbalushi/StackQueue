import java.util.Stack;

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
		//String str1 = "{int i=0;}{int x=1 {{}}}";
		// String str1 = "{{int x=0;}}}";
		String str1 = "{";
		System.out.println("Print the reverse string of " + str);
		reString(str);
		System.out.println();
		System.out.println("Print if there is open barantheses " + countBarn(str1));

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

		return true;
	}

}
