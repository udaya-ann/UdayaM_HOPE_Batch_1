public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null) return " ";

        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i) !=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}

// public static String longestCommonPrefix(String[] strs) {

//         String prefix = strs[0];

//         for (int i = 1; i < strs.length; i++) {

//             while (!strs[i].startsWith(prefix)) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//             }
//         }

//         return prefix;
// }