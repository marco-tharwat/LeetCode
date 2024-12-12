class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer wanted = new StringBuffer();
        for(int i = 0;i < Math.min(word1.length(), word2.length());i++) {
            wanted.append(word1.charAt(i));
            wanted.append(word2.charAt(i));
        }
        if(word1.length() > word2.length()){
            wanted.append(word1.substring(word2.length()));
        }
        else if (word2.length() > word1.length()) {
            wanted.append(word2.substring(word1.length()));
        }
        return wanted.toString();
    }
}