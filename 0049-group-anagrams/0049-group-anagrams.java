import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s : strs){
            char [] ss = (s.toCharArray());
            Arrays.sort(ss);
            String sorted = new String(ss);
            if (map.containsKey(sorted))
                map.get(sorted).add(s);
            else {
                List<String> res = new ArrayList<>();
                res.add(s);
                map.put(sorted, res);
            }
        }
        ArrayList<List<String>> s = new ArrayList<>(map.size());
        s.addAll(map.values());
        return s;
    }
}