class Solution {
    public int videoStitching(int[][] clips, int time) {

        Arrays.sort(clips,(a,b)->a[0]-b[0]);

        int count=0;
        int currentend=0;
        int farthest=0;
        int i=0;
        while(currentend<time){
            while(i<clips.length && clips[i][0]<=currentend){
                farthest=Math.max(farthest,clips[i][1]);
                i++;
            }
            if(farthest==currentend){
                return -1;
            }
            currentend=farthest;
            count++;
        }
        return count;
    }
}