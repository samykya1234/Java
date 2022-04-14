package taskfour;

class DuplicateArray{
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;
	
}
}

public class One extends DuplicateArray{

	public static void main(String[] args) {
		  int arr[] = {10,20,20,30,30,40,50,50};  
	        int l = arr.length;  
	        l = removeDuplicateElements(arr, l);  
	        for (int i=0; i<l; i++)  {
	           System.out.print(arr[i]+" ");  
	        }
	        System.out.println("\n" +l);
	    } 

		
	}

