public class Solution {
    public int RemoveElement(int[] nums, int val){
int numnOfTimes = 0;
for (int i = 0; i < nums.Length; i++)
{
    if (nums[i] == val)
    {
        nums[i] = int.MaxValue;
        numnOfTimes++;
    }
}
Array.Sort(nums);
return nums.Length - numnOfTimes;
    }
}