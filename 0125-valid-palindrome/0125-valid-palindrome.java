class Solution {
    public boolean isPalindrome(String s) {
        String m = s.toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l <= r){
            if (!((m.charAt(l) >= 'a' && m.charAt(l) <= 'z') || (m.charAt(l) >= '0' && m.charAt(l) <= '9'))) {
                l++;
                continue;
            }
            if (!((m.charAt(r) >= 'a' && m.charAt(r) <= 'z') || (m.charAt(r) >= '0' && m.charAt(r) <= '9'))){
                r--;
                continue;
            }
            if (!(m.charAt(l) == m.charAt(r)))
                return false;
            l++;
            r--;
        }
        return true;
    }
}