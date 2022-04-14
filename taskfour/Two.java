package taskfour;

public class Two{
	
	public int getSecondLargest(int[] a, int n){  
		int temp;  
		for (int i = 0; i < n; i++)   
		        {  
		            for (int j = i + 1; j < n; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[n-2];  
}

	public static void main(String[] args) {
		
		int a[]={1,2,5,6,7,2};  
		
		Two t = new Two();
		
		System.out.println("Second Largest: "  +t.getSecondLargest(a, 6));  

	}

}
