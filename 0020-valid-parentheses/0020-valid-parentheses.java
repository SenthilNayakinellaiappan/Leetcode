class Solution {
    public boolean isValid(String s) 
    {
        int top = 0;
        int check =0;
        char[] a = new char[s.length()];

        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') 
            {
                a[top] = s.charAt(i);
                top++;
                check =1;
            } 
            else if (top!=0 && s.charAt(i) == ')' && a[top-1] == '(') 
            {
                top--;
            } 
            else if (top!=0 && s.charAt(i) == ']' && a[top-1] == '[') 
            {
                top--;
            } 
            else if (top!=0 && s.charAt(i) == '}' && a[top-1] == '{')
            {
                top--;
            }
            else{
                return false;
            }
            // System.out.println(top+" "+i);
        }
        
        if (top == 0 && check ==1) 
        {
            return true;
        } 
        else
        {
        return false;
        }
}
}