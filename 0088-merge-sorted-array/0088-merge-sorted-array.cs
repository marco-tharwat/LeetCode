public class Solution
{
    public void Merge(int[] nums1, int m, int[] nums2, int n)
    {
        // 1 2 3 0 0 0     2 5 6
        int[] arr = new int[m];
        for (int j = 0; j < m; j++)
        {
            arr[j] = nums1[j];
        }
        int f = 0;
        int s = 0;
        int i = 0;
        while (f < m && s < n)
        {
            if (arr[f] <= nums2[s])
            {
                nums1[i] = arr[f];
                i++;
                f++;
            }
            else
            {
                nums1[i] = nums2[s];
                i++;
                s++;
            }
        }
        while (f < m && i < nums1.Length)
        {
            nums1[i] = arr[f];
            i++;
            f++;
        }
        while (s < n && i < nums1.Length)
        {
            nums1[i] = nums2[s];
            i++;
            s++;
        }
    }
}