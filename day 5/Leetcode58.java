class Leetcode58 {
    public int lengthOfLastWord(String s) {
        String[] words=s.trim().split(" ");
        return words[words.length-1].length();
    }
}