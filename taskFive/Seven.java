package taskFive;

import java.util.Stack;
import java.util.Scanner;

public class Seven {
	   public static boolean isBalanced(String exp)
	    {
	        
	        if (exp == null || exp.length() % 2 == 1) {
	            return false;
	        }
	 
	        
	        Stack<Character> stack = new Stack<>();
	 
	        for (char c: exp.toCharArray())
	        {
	            
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            }
	 
	            
	            if (c == ')' || c == '}' || c == ']')
	            {
	               
	                if (stack.empty()) {
	                    return false;
	                }
	 
	                Character top = stack.pop();
	 
	                if ((top == '(' && c != ')') || (top == '{' && c != '}')
	                        || (top == '[' && c != ']')) {
	                    return false;
	                }
	            }
	        }
	 
	        return stack.empty();
	    }	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string expression : ");
		String exp = sc.nextLine();
		 
	        if (isBalanced(exp)) {
	            System.out.println("The expression is balanced");
	        }
	        else {
	            System.out.println("The expression is not balanced");
	        }
	}

}
