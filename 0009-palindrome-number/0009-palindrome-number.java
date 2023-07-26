class Solution {
    public boolean isPalindrome(int x)
    {
        int a=x;

        if(x<0)
        x=(-1)*x;

        int rev=0;
        int rem;

        while(x>0)
        {
          rem=x%10; 
          rev=(rev*10)+rem;
          x=x/10; 
        }
        if(rev==a)
        return  true;

        else
        return false;
        
    }
}