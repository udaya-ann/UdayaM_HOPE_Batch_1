class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left=0;
        int right=skill.length-1;
        int target=skill[left]+skill[right];
        long ans=0;
        while(left<right){
            if(skill[left]+skill[right]!=target){
                return -1;
            }
            ans+=(long)skill[left]*skill[right];
            left++;
            right--;
        }
        return ans;
    }
}