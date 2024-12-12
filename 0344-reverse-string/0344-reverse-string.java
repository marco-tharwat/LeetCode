class Solution {
    public void reverseString(char[] s) {
        char temp = 0;
        int l = 0;
        int r = s.length - 1;
        while (l <= r){
            if (s[l] != s[r]){
                temp = s[l];
                s[l] = s[r];
                s[r] = temp;
            }
            l++;
            r--;
        }
    }
}