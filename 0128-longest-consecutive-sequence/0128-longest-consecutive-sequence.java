import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
        }
        int res = 0;
        for (int n : nums){
            if (!set.contains(n - 1)){
                int count = 1;
                int next = n + 1;
                while (set.contains(next)){
                    count++;
                    next++;
                }
                res = Math.max(count,res);
            }
        }
        return res;
    }
}