class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
      
       
        for(int i=0;i<image.length;i++)
         {
              int end=image.length-1;
              int start=0;
             while(start<end)
             {
             int temp=1-image[i][start];
             image[i][start]=1-image[i][end];
             image[i][end]=temp;
             start++;
             end--;
             }
              if (start == end) {
                image[i][start] = 1 - image[i][start];
            }
       }

       return image;

        
    }
}