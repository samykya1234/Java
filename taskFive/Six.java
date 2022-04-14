package taskFive;
import java.util.Scanner;

public class Six {
	 public static String invertCase(String str)
	    {
	        char[] chars = str.toCharArray();
	        for (int i = 0; i < chars.length; i++)
	        {
	            chars[i] = Character.isUpperCase(chars[i])
	                                ? Character.toLowerCase(chars[i])
	                                : Character.toUpperCase(chars[i]);
	        }
	        return new String(chars);
	    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		 String str = sc.nextLine();
	        System.out.println(invertCase(str));

	}

}
