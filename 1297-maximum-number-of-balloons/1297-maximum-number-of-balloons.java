import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        String target = "balloon";
        for (char c : text.toCharArray()){
            if (target.indexOf(c) != -1) {
                if (!map.containsKey(c))
                    map.put(c, 1);
                else {
                    int temp = map.get(c);
                    map.replace(c, ++temp);
                }
            }
        }
        if (!map.containsKey('b'))
            return 0;
        int result = map.get('b');
        for (char c : target.toCharArray()){
            if (!map.containsKey(c))
                return 0;
            if (c == 'l' || c == 'o')
                result = result > (map.get(c) / 2) ? (map.get(c) / 2) : result;
            else
                result = result > map.get(c) ? map.get(c) : result;
        }
        return result;
    }
}