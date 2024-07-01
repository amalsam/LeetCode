class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        
         List<Boolean> boolCandy = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            boolCandy.add(false);
        }
        int max = candies[0];
        for(int i:candies){
            if(i>max)max=i;
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies >=max)boolCandy.set(i,true);
        }
        
       return boolCandy; 
    }
}