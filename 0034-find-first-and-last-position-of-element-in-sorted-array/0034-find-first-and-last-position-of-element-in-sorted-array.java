class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int i=0;
        int j=nums.length-1;
        int k=0;
        int b[]={-1,-1};
        while(i<=j)
        {
            if(nums[i]==target)
            {
                b[k]=i;
                k++;
                break;
            }
            i++;
        }
        while(j>=i)
        {
            if(nums[j]==target)
            {
               b[k]=j;
               break;
            }
            j--;
        }
        return b;
    }
}