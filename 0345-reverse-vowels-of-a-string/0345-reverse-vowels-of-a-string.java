class Solution {
    public String reverseVowels(String s) {
        char[] array=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !vowel(array[start]))start++;
            while(start<end && !vowel(array[end])) end--;
            char temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return new String(array);
        

    }
    public boolean vowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}