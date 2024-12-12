class Solution {
    public int trap(int[] height) {
        int rightMax = 0, leftMax = 0;
        int len = height.length;
        int sum = 0;
        int[] right = new int[len], left = new int[len];
        
        for (int i = 0;i < len;i++){
            left[i] = leftMax;
            leftMax = Math.max(leftMax,height[i]);
        }
        for (int i = len - 1;i >= 0;i--){
            right[i] = rightMax;
            rightMax = Math.max(rightMax,height[i]);
        }
        for (int i = 0;i < len;i++){
            int temp = Math.min(left[i],right[i]) - height[i];
            if (temp >= 0){
                sum += temp;
            }
        }
        return sum;
    }
}