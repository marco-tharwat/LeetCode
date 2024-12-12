class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int k=0;
        int sLength = s.length();
        int tLength = t.length();
        for(int i = 0;i < tLength && k < sLength;i++){
            if(s.charAt(k) == (t.charAt(i))){
                k++;
            }
        }
        return k == s.length();
    }
}