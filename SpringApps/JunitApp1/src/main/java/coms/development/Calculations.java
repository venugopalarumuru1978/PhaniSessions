package coms.development;

public class Calculations {

	public int Addition(int x, int y)
	{
		return x+y;
	}
	
    public int findMin(int arr[]){  
        int min=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(min>arr[i])  
                min=arr[i];  
        }  
        return min;  
    } 
    
    public void exception(int n)
	{
		int div = 10/n;
		System.out.println("Result " + div);		
	}


}

/*
 * two +ve values
 * two -ve values
 * 1 +ve 1 -ve values
 */

