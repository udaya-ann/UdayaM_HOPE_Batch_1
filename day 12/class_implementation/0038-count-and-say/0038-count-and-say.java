class Solution {
    public String countAndSay(int n) {
        String res="1";
        
        for(int i=1;i<n;i++){
            StringBuilder s=new StringBuilder();
            int count=1;
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==res.charAt(j-1))count++;
                else{
                    s.append(count).append(res.charAt(j-1));
                    count=1;
                }
            }
            s.append(count).append(res.charAt(res.length()-1));
            res=s.toString();
        }
        return res;
    }
}