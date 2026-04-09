class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int n:nums1)s1.add(n);
        for(int m:nums2){
            if(s1.contains(m))s2.add(m);
        }
        int[] arr=new int[s2.size()];
        int i=0;
        for(int num:s2){
            arr[i]=num;
            i++;
        }
        return arr;
    }
}