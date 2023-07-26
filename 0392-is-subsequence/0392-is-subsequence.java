class Solution {
    public boolean isSubsequence(String s, String t)
    {
    int i=0;
    int j=0;

     int n=s.length();
     int m=t.length();

     char[]ch=s.toCharArray();
     char[]ch1=t.toCharArray();

     if(s.length()==0)
     return true;

      if(s.length()>t.length())
       return false;

       else
       {
         while(i<n && j<m)
         {
           if(ch[i]==ch1[j])
           {
               i++;
               j++;
           }
           else
           j++;
         }   
       } 
       if(i==ch.length)
       return true;

       else
       return false;
        
    }
}