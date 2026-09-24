class Solution {
    List<String> answer=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(0,0,n,"");
        return answer;
    }
    private void generate(int ob,int cb,int n,String curr){
        if(curr.length()==n*2){
            answer.add(curr);
            return;
        }
        if(ob<n){
            generate(ob+1,cb,n,curr+"(");
        }
        if(cb<ob){
            generate(ob,cb+1,n,curr+")");
        }
    }
}