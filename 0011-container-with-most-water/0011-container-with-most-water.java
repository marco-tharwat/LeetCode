class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length - 1;
        int area = 0;
        while (low <= high){
            int h = Math.min(height[high], height[low]);
            int w = high - low;
            int temp = h * w;
            area = Math.max(temp, area);
            if (height[low] < height[high])
                low++;
            else if (height[low] > height[high])
                high--;
            else{
                high--;
                low++;
            }
        }
        return area;
    }
}