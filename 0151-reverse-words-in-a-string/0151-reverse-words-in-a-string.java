class Solution {
    public String reverseWords(String s) 
    {
        String[]str=s.split(" ");
        System.out.println(Arrays.toString(str));
        String[]str1=new String[str.length];

        int i=0;
        int j=str1.length-1;
        while(j>=0)
        {
            str1[i]=str[j];
            i=i+1;
            j--;
        }
      StringBuilder resultStr = new StringBuilder();
     for (int k = 0; k < str1.length; k++) 
     {  if(!str1[k].equals("")){
            resultStr.append(str1[k]);
            resultStr.append(" ");
     }
     }
 
         return(resultStr.toString().trim());
    }
}