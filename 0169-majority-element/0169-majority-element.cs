public class Solution {
   public int MajorityElement(int[] nums)
{
    Dictionary<int, int> keyCount = new();
    for (int i = 0; i < nums.Length; i++)
    {
        if (keyCount.ContainsKey(nums[i]))
        {
            keyCount[nums[i]]++;
        }
        else
        {
            keyCount[nums[i]] = 1;
        }
    }
    int countValue = int.MinValue;
    int target = 0;
    foreach (var item in keyCount)
    {
        if (item.Value > countValue)
        {
            countValue = item.Value;
            target = item.Key;
        }
    }
    return target;
}
}