class Solution {
    public int largestAltitude(int[] gain) 
    {

        int start=0;
        int curr=0;
        int max=0;
        for(int i=0;i<gain.length;i++)
        {
            curr=start+gain[i];
            if(curr>max)
             max=curr;

             start=curr;

        }
        return max;
    }
}