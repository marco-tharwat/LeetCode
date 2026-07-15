public class Solution {
    public int RemoveDuplicates(int[] nums) {
                int countOfUnique = nums.Length;

        for (int i = 0; i < nums.Length - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                countOfUnique--;
                nums[i] = int.MaxValue;
            }
        }
        Array.Sort(nums);
        return countOfUnique;
    }
}