class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int a[]=new int[nums.length];
        int k=0;
        int count=0;
        int max;

        for(int i=0;i<nums.length;i++)
        {
            max=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(max>nums[j])
                {
                  count++;
                }
            }
            a[k]=count;
            k++;
            count=0;
        }
        return a;
    }
}