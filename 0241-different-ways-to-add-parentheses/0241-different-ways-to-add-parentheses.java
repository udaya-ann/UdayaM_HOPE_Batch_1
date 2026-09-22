class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='+'|| ch=='-'||ch=='*'){
                List<Integer> left=diffWaysToCompute(expression.substring(0,i));
                List<Integer> right=diffWaysToCompute(expression.substring(i+1));
                for(int a:left){
                    for(int b:right){
                        if(ch=='+')
                            ans.add(a+b);
                        else if(ch=='-')
                            ans.add(a-b);
                        else
                            ans.add(a*b);
                    }
                }
            }
        }
        if(ans.isEmpty()){
            ans.add(Integer.parseInt(expression));
        }
            return ans;
        
    }
}