public class Solution {
    public void SortColors(int[] nums)
    {
        Sort(nums,0,nums.Length-1);
    }
    private void Sort(int[] arr, int l, int r)
    {
        if (l >= r)
        {
            return;
        }
        int mid  = (l+r)/2;
        Sort(arr,l,mid);
        Sort(arr,mid+1,r);
        Merge(arr,l,mid,r);   
    }
    private void Merge(int[] arr, int l, int m, int r) 
    {
        int i = l;
        int j = 0, k = 0;
        int[] left = new int[m-l+1];
        int[] right = new int[r-m];
        Array.Copy(arr,l,left,0,m-l+1);
        Array.Copy(arr,m+1,right,0,r-m);

        while (j<left.Length && k< right.Length)
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
            i++;
            j++;
        }
        for (int c = k; c < right.Length; c++)
        {
            arr[i] = right[c];
            i++;
            k++;
        }
    }
}