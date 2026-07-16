public class Solution
{
    public int[] SortArray(int[] nums)
    {
        MergeSort(nums, 0, nums.Length - 1);
        return nums;
    }
    private void MergeSort(int[] arr, int l, int r)
    {
        if (l == r)
            return;

        int m = (l + r) / 2;
        MergeSort(arr, l, m);
        MergeSort(arr, m + 1, r);
        Merge(arr, l, m, r);
        return;
    }
    private void Merge(int[] arr, int l, int m, int r)
    {
        int j = 0, k = 0;
        int i = l;
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];
        Array.Copy(arr, l, left, 0, left.Length);
        Array.Copy(arr, m + 1, right, 0, right.Length);
        //  3   2   6   5   4   6
        //  l       m           r
        //  0       2           5
        while (j < left.Length && k < right.Length)
        {
            if (left[j] <= right[k])
            {
                arr[i] = left[j];
                j++;
            }
            else
            {
                arr[i] = right[k];
                k++;
            }
            i++;
        }
        for (int c = j; c < left.Length; c++)
        {
            arr[i] = left[c];
            j++;
            i++;
        }
        for (int c = k; c < right.Length; c++)
        {
            arr[i] = right[c];
            k++;
            i++;
        }
    }
}