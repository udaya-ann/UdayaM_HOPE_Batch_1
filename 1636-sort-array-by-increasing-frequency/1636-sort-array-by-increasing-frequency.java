class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(a)-map.get(b);
            }
            return b-a;
        });
        int[] ans=new int[nums.length];
        int index=0;
        for(int num:list){
            int freq=map.get(num);
            while(freq>0){
                ans[index++]=num;
                freq--;
            }
        }
        return ans;
    }
}