public class Solution {
   public int MajorityElement(int[] nums)
{
    int count = 0;
    int target = 0;

    foreach (var item in nums)
    {
        if (count == 0)
        {
            target = item;
        }
        if (target == item)
        {
            count++;
        }
        else
        {
            count--;
        }
    }
    return target;
}
}