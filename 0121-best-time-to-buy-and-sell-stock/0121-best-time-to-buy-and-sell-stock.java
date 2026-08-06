class Solution {
    public int maxProfit(int[] prices) {
        int miniPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(price<miniPrice){
                miniPrice=price;
            }else{
                maxProfit=Math.max(maxProfit,price-miniPrice);
            }
        }
        return maxProfit;
        }
    }