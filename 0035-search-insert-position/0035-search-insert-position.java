class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int low=0;
        int high=nums.length-1;
        int mid=(low+high)/2;

        while(low<high)
        {
            if(nums[mid]==target)
             return mid;
  
             else if(nums[mid]>target)
             high=mid-1;

             else
             low=mid+1;

              mid=(low+high)/2;
        }
                   System.out.print(low);
                              System.out.print(high);
      /*  if(low==high && low==nums.length-1)
        {
            return low+1;
        }*/
         if(low==high && nums[low]<target)
              return low+1;

         else if(low==high && nums[low]>=target && low>0)
         {
           
              return low;
         }

         else if(low==high &&nums[low]>=target && low==0)
          return 0;

          else if(low>high && nums[low]>target)
          return low;

          return 0;

    }
}