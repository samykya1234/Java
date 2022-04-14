package taskfour;
import java.util.Scanner;

public class Nine {
    public static void findPair(int arr[], int target)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == target)
                {
                    System.out.println("Pair found (" + arr[i] + "," + arr[j] + ")");
                    return;
                }
            }
        }
 
        System.out.println("Pair not found");
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int values[] = {1,2,4,5,6 };
        
        System.out.println("Enter the target :");
        int t = sc.nextInt();
        
 
        findPair(values, t);
    
	}

}
