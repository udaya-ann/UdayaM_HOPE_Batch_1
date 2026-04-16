import java.util.*;

public class MaxLengthSubArray {
    public int maxLength(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int mlen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0)mlen=i+1;
            else{
                if(map.containsKey(sum)){
                    int len=i-map.get(sum);
                    mlen=Math.max(len,mlen);
                }else{
                    map.put(sum,i);
                }
            }
        }
        return mlen;
    }
    public static void main(String[] args) {
        MaxLengthSubArray m=new MaxLengthSubArray();

        int[] arr={8,-2,2,-3,-3};
        System.out.println(m.maxLength(arr));
    }
}
