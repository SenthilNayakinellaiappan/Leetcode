class Solution {
    public int reverse(int x) 
    {
        long rev=0;
        int rem=0;
        int s1=0;
        int flag=0;
        int l=-2147483648;
        int h=2147483647;
        if(x<0)
        {
        flag=1;
        s1=Math.abs(x);
        while(s1>0)
        {
            rem=s1%10;
            rev=(rev*10)+rem;
            s1=s1/10;
        }        

        }
        else
        {
        while(x>0)
        {
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        }

        if(rev>h || rev<l)
          return 0;

        if(flag==1)
         return (int) -rev;

        else
          return (int) rev;        
    }
}