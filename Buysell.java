class Solution {
    public int maxProfit(int[] prices) {
        int sp=0;
        int cp=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            
                cp=prices[i];
            
            if(i!=prices.length-1){
                if(cp<prices[i+1]){
                    sp=sp+(prices[i+1]-cp);
                }
            }
        }
        return sp;
    }
}
