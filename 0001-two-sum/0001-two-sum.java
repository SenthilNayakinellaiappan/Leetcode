class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
       int n=nums.length;
       int [] res=new int[2];
       int k=0;
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(nums[i]+nums[j]==target)
               {
                    res[k]=i;
                    res[k+1]=j;
                    break;
               }
           }

       }
       return res;
    }
}