class Solution {
    public boolean checkIfPangram(String sentence) {
        char ch[]=sentence.toCharArray();
        Arrays.sort(ch);


        if(ch.length < 26)
        return false;

        int a[]=new int[26];

        for(int i=0;i<ch.length;i++)
        {
            a[ch[i]-97]++;
        }

        int flag=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                flag=1;
                break;
            }

        }

        if(flag==1)
        return false;


        return true;
    }
}