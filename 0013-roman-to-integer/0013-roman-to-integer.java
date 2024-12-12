import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        
        int i = 0;
        int length = s.length();
         while (i < length){
            if (i + 1 < s.length() && ((int)map.get(s.charAt(i)) < (int)map.get(s.charAt(i+1)))) {
                result += (int) map.get(s.charAt(i + 1)) - (int) map.get(s.charAt(i));
                i += 2;
            }
            
            else {
                result += (int) map.get(s.charAt(i));
                i++;            
            }
        }
        return result;
    }
}