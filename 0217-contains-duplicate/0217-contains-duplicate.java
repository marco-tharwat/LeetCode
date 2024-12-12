import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0;i < length;i++){
            if (map.get(nums[i]) == null)
                map.put(nums[i], 1);
            else {
                return true;
            }
        }
        return false;
    }
}