public class Solution
{
    public IList<int> MajorityElement(int[] nums)
    {
        int minLen = nums.Length / 3;
        Dictionary<int,int> count = new();
        List<int> result = new();
        foreach (var item in nums)
        {
            if (count.ContainsKey(item))
            {
                count[item]++;
            }
            else
            {
                count[item] = 1;
            }
        }
        foreach (var item in count)
        {
            if (item.Value > minLen)
            {
                result.Add(item.Key);
            }
        }
        return result;
    }
}