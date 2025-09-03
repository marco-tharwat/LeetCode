class Solution
{
    public int[] TopKFrequent(int[] nums, int k)
    {
        Dictionary<int, int> frequencyCount = new();
        List<int> result = new();

        for (int i = 0; i < nums.Length; i++)
        {
            if (frequencyCount.ContainsKey(nums[i]))
            {
                frequencyCount[nums[i]]++;
            }
            else
            {
                frequencyCount.Add(nums[i], 1);
            }
        }
        for (int i = 0; i < k; i++)
        {
            int max = int.MinValue;
            int key = 0;
            foreach (var item in frequencyCount)
            {
                if (item.Value > max)
                {
                    max = item.Value;
                    key = item.Key;
                }
            }
            result.Add(key);
            frequencyCount.Remove(key);
        }
        return result.ToArray();
    }
}