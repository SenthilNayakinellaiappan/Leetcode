class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;

       int a[]=new int [2];
       
       int k=0;
       int  l=n-1;
       int m=0;
       int temp;

      while(k<l)
      {
          if(nums[k]+nums[l]==target)
          {
              a[0]=k+1;
              a[1]=l+1;
              break;
          }

          else if(nums[k]+nums[l]>target)
          {
              l--;
          }
          else
          {
              k++;
          }
      }
     
       return a; 
        
    }
}