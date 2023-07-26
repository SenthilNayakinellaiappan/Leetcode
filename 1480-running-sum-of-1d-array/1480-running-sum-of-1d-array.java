class Solution 
{
    public int[] runningSum(int[] nums) 
    {
         int a[]=new int[nums.length];

         int sum=0;
         int k=0;
         for(int i=0;i<nums.length;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 sum+=nums[j];        
             }
             a[k]=sum;
             k++;
             sum=0;
         }    
         return a;
    }
}