package taskFive;
import java.util.Scanner;

public class ReverseInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String input = sc.nextLine();
		
		String words[] = input.split("\\s");
		String output = "";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseword = "";
			for(int j=word.length()-1;j>=0;j--) {
				reverseword = reverseword + word.charAt(j);
			}
			output = output + reverseword + " ";
			
		}
		System.out.println("The string after reverse is : " +output);
		
		
	}

}
