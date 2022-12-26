package logical;

class GfGFloorSortArr 
{
	static int findFloor(long arr[], int n, long x)
    {
        long s=0,b=-2;
        int i=0,t=0;
        for(i=0;i<=n-1;i++)
        {
            if(arr[i]<=x)
            {
                s=arr[i];
                if(s>b)
                {
                	b=s;
                	t=i;
                }
                
            }
        }
        
        if(b==-2)
        return -1;
        return t;
    }
       
    
	public static void main(String[] args) 
	{
		long[] arr = {1,2,0,10,3,12,19};
		System.out.println(findFloor(arr,7,20));
		
	}	
}
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    
