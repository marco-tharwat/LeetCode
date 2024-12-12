import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n))
                map.put(n,1);
            else {
                int temp = map.get(n);
                map.put(n, ++temp);
            }
        }
        int count = map.get(nums[0]);
        int res = nums[0];
        for (int n : nums){
            if (map.get(n) > count){
                count = map.get(n);
                res = n;
            }
        }
        return res;
    }
}