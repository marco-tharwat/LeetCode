public class Solution {
        public int[] GetConcatenation(int[] nums)
        {
            int n = nums.Count();
            int[] answer = new int[2 * n];
            for (int i = 0; i < n; i++)
            {
                answer[i] = answer[i + n] = nums[i];
            }
            return answer;
        }
}