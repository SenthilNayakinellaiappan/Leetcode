class Solution 
{
    public int myAtoi(String s) 
    {
        s=s.strip();
        char[]ch=s.toCharArray();
        int flag=0;
        int isneg=1;
        long ans=0;
        if(s.length()>1)
        {
        String s1=s.substring(0,2);
        if(s1.equals("+-") || s1.equals("-+")|| s1.equals("+"))
        return 0;
        }
        if(ch.length==0)
        return 0;

        for(int i=0;i<ch.length;i++)
        {  
           if(ch[i]=='.')
            break;

        if(ch[i]=='+'||ch[i]=='-')
        {
           if(i>0)
            break;
        }

            if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z'))
            {
            if(i==0)
            return 0;
            break;
            }
            if((ch[i]>= '0' && ch[i]<= '9')||ch[i]=='+'||ch[i]=='-'||ch[i]==' ')
            {
             if(ch[i]==' ')
             {
                break;
             }
             if(ch[i]=='-' && i==0)
                {
                    isneg=-1;
                }
                else if(ch[i]=='-' && i!=0)
                {
                    break;
                }
                else if(Character.isDigit(ch[i]))
                {
                 ans=ans*10+ch[i]-48;
                 System.out.print(ch[i]);
                  if (isneg * ans <= Integer.MIN_VALUE)
                   return Integer.MIN_VALUE;

                  else if (isneg * ans >= Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                }
            }
        }
        return isneg*(int)ans;
    }
}