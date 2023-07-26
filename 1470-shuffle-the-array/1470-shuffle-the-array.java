class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
      int start=0; 

      int a[]=new int[2*n];
   

    for(int i=0;i<2*n;i=i+2)
    {
        a[i]=nums[start];
        a[i+1]=nums[start+n];
        start++;
    } 
    return a;
        
    }
}