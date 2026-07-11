class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
            if(count>0){
                sb.append(s.substring(i+1,i+count+1)).append(" ");
                count=0;
            }
            }else{
                count++;
            }
        }
        if(count>0){
            sb.append(s.substring(0,count));
        }
        return sb.toString().trim();
    }
}