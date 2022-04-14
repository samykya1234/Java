package taskFive;
import java.util.Arrays;

public class Four {

	static boolean isogram(String str)
    {
        
        str = str.toLowerCase();
        int len = str.length();
 
        char arr[] = str.toCharArray();
 
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
		
		String str1 = "Elephant";
        System.out.println(isogram(str1));
        String str2 = "Consult";
        System.out.println(isogram(str2));

	}

}
