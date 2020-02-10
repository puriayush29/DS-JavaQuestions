class Solution {
    public int candy(int[] ratings) {
        int candies[] = new int[ratings.length];
        int sum =0,flag=0;
       
        for(int j=0;j<ratings.length;j++)
        {
            candies[j] = 1;
        }
        for(int i=1;i<ratings.length;i++)
        {
            
            if(ratings[i-1]> ratings[i])
            {
                candies[i-1]++;
                if(i>1){
                if(candies[i-1]==candies[i-2])
                {
                    if(ratings[i-2] > ratings[i-1])
                    {
                        candies[i-2]++;
                    }
                    else
                    {
                        candies[i-1]++;
                    }
                
                }
                    
                    
                }
            }
            else if(ratings[i] > ratings[i-1])
            {
                candies[i]++;
               
                if(candies[i] == candies[i-1])
                {
                    if(ratings[i]>ratings[i-1])
                    {
                        candies[i]++;
                    }
                    else
                    {
                        candies[i-1]++;
                    }
                }
                else if(candies[i-1] > candies[i])
                {
                    if(ratings[i]>ratings[i-1])
                    {
                        int n1 = candies[i-1]-candies[i];
                        candies[i] = candies[i] + 1 + n1;
                        
                    }
                }
            }
            if(i<ratings.length-1){
            if(ratings[i-1] < ratings[i] && ratings[i] > ratings[i+1])
            {
                candies[i]--;
            }
            }
        }
       
            for(int i=0;i<ratings.length;i++)
            {
                sum+=candies[i];
            }
            
           return sum;
    }
}
