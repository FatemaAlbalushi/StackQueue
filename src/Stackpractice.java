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
		String str="Fatma";
		String str1 = "{int i=0;}{int x=1 {{}}}";	
		System.out.println("Print the reverse string of "+ str);
		reString(str);

	}
	public static void reString(String userString) {
		
		Stack<Character> mystack = new Stack<Character>();
		for(int index = 0; index<userString.length();index++) {
			mystack.push(userString.charAt(index));
			
		}
		while (!mystack.empty()) {
			System.out.print(mystack.pop());	
				
		}
		
		
	}

}
