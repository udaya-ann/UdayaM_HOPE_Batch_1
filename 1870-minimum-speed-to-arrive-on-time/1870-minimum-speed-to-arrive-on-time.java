class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1,r=10000000;

        while(l<r){
            int m=(l+r)/2;
            double time=0;

            for(int i=0;i<dist.length;i++){
                if(i==dist.length-1)
                    time+=(double)dist[i]/m;
                else
                    time+=Math.ceil((double)dist[i]/m);
            }

            if(time<=hour)
                r=m;
            else
                l=m+1;
        }

        double time=0;

        for(int i=0;i<dist.length;i++){
            if(i==dist.length-1)
                time+=(double)dist[i]/l;
            else
                time+=Math.ceil((double)dist[i]/l);
        }

        if(time>hour)
            return -1;

        return l;
    }
}