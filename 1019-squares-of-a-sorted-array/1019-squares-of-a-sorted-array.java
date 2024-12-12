import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0;i < nums.length;i++){
            nums[i] *= nums[i];
        }
        int left = 0, right = nums.length - 1;
        int res[] = new int[nums.length];
        int index = 0;
        while (left <= right){
            if (nums[left] > nums[right]){
                res[index] = nums[left];
                index++;
                left++;
            }
            else {
                res[index] = nums[right];
                index++;
                right--;
            }
        }
        right = nums.length - 1;
        left = 0;
        nums = null;
        int temp = 0;
        while (left <= right){
            temp = res[right];
            res[right] = res[left];
            res[left] = temp;
            left++;
            right--;
        }
        return res;
    }
}