public class Leetcode557 {
    public String reverseWords(String s) {
        String result="";
        String[] words=s.split(" ");
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);
            result+=sb.reverse().toString()+" ";
        }
        return result.trim();
    }
}
