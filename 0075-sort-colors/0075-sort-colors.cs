public class Solution {
    //  2 1 2 0 0 1
    //  0 1 2 2 0 1
    //  0 0 2 2 1 1            
    public void SortColors(int[] nums)
    {
        //int zCount = 0;
        //int oCount = 0;
        int temp = -1;
        int index = 0;
        for (int i = 0; i < nums.Length && index < nums.Length; i++)
        {
            if (nums[i] == 0)
            {
                //zCount++;
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        for (int i = 0; i < nums.Length && index < nums.Length; i++)
        {
            if (nums[i] == 1)
            {
                //oCount++;
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        for (int i = 0; i < nums.Length && index < nums.Length; i++)
        {
            if (nums[i] == 2)
            {
                //oCount++;
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
    }
}