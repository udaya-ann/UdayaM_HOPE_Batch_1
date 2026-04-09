class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totb=numBottles;
        while(numBottles>=numExchange){
            int newb=numBottles/numExchange;
            totb+=newb;
            numBottles=newb+(numBottles%numExchange);
        }
        return totb;
    }
}