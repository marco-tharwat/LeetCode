import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i < jewels.length();i++){
            map.put(jewels.charAt(i), 0);
        }

        for (int i = 0;i < stones.length();i++){
            if (map.get(stones.charAt(i)) != null){
                int current = map.get(stones.charAt(i));
                map.replace(stones.charAt(i), ++current);
            }
        }

        int result = 0;
        for (int i = 0;i < jewels.length();i++){
            result += map.get(jewels.charAt(i));
        }
        return result;
    }
}