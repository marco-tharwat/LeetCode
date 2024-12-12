import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        HashMap<Character, Integer> ransomMap = new HashMap<>();

        for (char c : magazine.toCharArray()){
            if (magazineMap.get(c) == null)
                magazineMap.put(c, 1);
            else {
                int temp = magazineMap.get(c);
                magazineMap.replace(c, ++temp);
            }
        }
        for (char c : ransomNote.toCharArray()){
            if (! magazineMap.containsKey(c))
                return false;
            if (ransomMap.get(c) == null)
                ransomMap.put(c, 1);
            else {
                int temp = ransomMap.get(c);
                ransomMap.replace(c, ++temp);
            }
            if (magazineMap.get(c) < ransomMap.get(c))
                return false;
        }
        return true;
    }
}