public class Solution {
    public int FirstMissingPositive(int[] nums) {
        HashSet<int> unique = new(nums);
for (int i = 1; i < nums.Length +1 ; i++)
{
    if (!unique.Contains(i))
    {
        return i;
    }
}
return nums.Length +1;
    }
}