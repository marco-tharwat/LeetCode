import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!sMap.containsKey(c))
                sMap.put(c, 1);
            else {
                int temp = sMap.get(c);
                sMap.replace(c, ++temp);
            }
        }
        for (char c : t.toCharArray()) {
            if (!sMap.containsKey(c))
                return false;
            int temp = sMap.get(c);
            sMap.replace(c,--temp);
        }
        for (char c : s.toCharArray()){
            if (sMap.get(c) != 0)
                return false;
        }

        return true;
    }
}