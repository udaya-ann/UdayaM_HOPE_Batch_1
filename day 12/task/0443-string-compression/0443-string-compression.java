class Solution {
    public int compress(char[] chars) {
        StringBuilder s=new StringBuilder();
        int count=1;
        if(chars.length==1)return 1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }else{
                if(count==1){
                    s.append(chars[i-1]);
                }else{
                    s.append(chars[i-1]).append(count);
                    
                }
                count=1;
            }
        }
        if(count==1){
            s.append(chars[chars.length-1]);
        }else{
            s.append(chars[chars.length-1]).append(count);
        }
         for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}