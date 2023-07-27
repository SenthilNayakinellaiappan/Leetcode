class Solution 
{
    public int mySqrt(int x) 
    {
        long low=0;
        long high=x;
        long res=0;
         long s,mid;

        while(low<=high)
        {
           mid=low+(high -low)/2;
           s=mid*mid;

            if(s<x)
            {
            res=mid;
            low=mid+1;
            }

            else if(s>x)
            high=mid-1;

            else
            {
            return (int)mid;
            }
        }
        return (int)res;
    }
}