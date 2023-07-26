class Solution {
    public int findNumbers(int[] nums) 
    {
        int count=0;
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                count++;
                nums[i]=nums[i]/10;
            }
            if(count%2==0)
            {
                count1++; 
            }
            count=0;
        }
        return count1;
        
    }
}