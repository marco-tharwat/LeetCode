import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        return bsearch(nums,0,nums.length - 1, target);
    }

    private int bsearch (int [] nums, int left, int right, int target){
        int mid = (left + right) / 2;
        if (left > right)
            return -1;

        if (nums[mid] == target)
            return mid;

        else if (nums[mid] < target)
            return bsearch(nums, mid + 1, right, target);

        return bsearch(nums, left, mid - 1, target);
    }
}