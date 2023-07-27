class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        /*int low=0;
        int high=nums.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if((a[mid]==a[mid+1])|| a[mid]==a[mid-1])
            {
                
            }
        }*/
        
        int ans=0;
        
        for(int i=0;i<nums.length;i++)
        {
            ans=ans^nums[i];
        }
        return ans;
        
    }
}