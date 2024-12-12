import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>>answer = new ArrayList<>();

        for (int i = 0; i < len; i++){
            if (nums[i] > 0)
                break;
            else if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int low = i + 1, high = len - 1;
            while (low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0){
                    answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1])
                        low++;
                    while (low < high && nums[high] == nums[high + 1])
                        high--;
                }
                else if (sum < 0)
                    low++;
                else
                    high--;
            }
        }
        return answer;
    }
}