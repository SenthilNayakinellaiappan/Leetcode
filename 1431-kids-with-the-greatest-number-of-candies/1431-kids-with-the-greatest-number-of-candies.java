class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List <Boolean> bools=new ArrayList<>();
        int max=candies[0];

        for(int i=0;i<candies.length;i++)
        {
            if(max<=candies[i])
            max=candies[i];

        }
        for(int i=0;i<candies.length;i++)
        {
            candies[i]+=extraCandies;

            if(candies[i]>=max)
            {
                bools.add(Boolean.TRUE);
            }
            else
            {
                 bools.add(Boolean.FALSE);
            }
        }
        return bools;
    }
}