public class Solution {
   public int MajorityElement(int[] nums)
{
    int count = 0;
    int j = 0;
    for (int i = 0; i < nums.Length; i++)
    {
        if (nums[j] == nums[i])
        {
            count++;
        }
        if (i == nums.Length - 1)
        {
            if (count <= nums.Length / 2)
            {
                i = -1;
                count = 0;
                j++;
            }
            else
            {
                break;
            }
        }
    }
    return nums[j];
}
}