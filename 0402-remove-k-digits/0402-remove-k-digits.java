class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder s=new StringBuilder();
        for(char ch:num.toCharArray()){
            while(k>0 && s.length()>0 && s.charAt(s.length()-1)>ch){
                s.deleteCharAt(s.length()-1);
                k--;
            }
            s.append(ch);
        }
        while(k>0){
            s.deleteCharAt(s.length()-1);
            k--;
        }
        while(s.length()>1 && s.charAt(0)=='0'){
            s.deleteCharAt(0);
        }

        return s.length()==0?"0":s.toString();
    }
}