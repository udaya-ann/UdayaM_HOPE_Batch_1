class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int total=0;
        int track=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            total+=diff;
            track+=diff;
            if(track<0){
                start=i+1;
                track=0;
            }
        }
        if(total<0){
            return -1;
        }
        return start;
    }
}