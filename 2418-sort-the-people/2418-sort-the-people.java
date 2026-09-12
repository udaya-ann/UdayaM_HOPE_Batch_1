class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        int n=heights.length;
        Arrays.sort(heights);
        for(int i=0;i<n/2;i++){
            int temp=heights[i];
            heights[i]=heights[n-1-i];
            heights[n-1-i]=temp;
        }
        String[] name=new String[n];
        for(int i=0;i<n;i++){
            name[i]=map.get(heights[i]);
        }

        return name;
    }
}