class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !isVowel(ch[left]))left++;
            while(left<right && !isVowel(ch[right]))right--;
            char t=ch[left];
            ch[left]=ch[right];
            ch[right]=t;
            left++;
            right--;
        }
        return new String(ch);
    }
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return (c=='a'|| c=='e' || c=='i' ||c=='o' || c=='u');
    }
}