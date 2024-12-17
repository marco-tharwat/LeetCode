import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int res [] = new int[len];
        Stack<int []> st = new Stack<>();

        for (int i = 0; i < len; i++) {
            int current = temperatures[i];

            while (!st.isEmpty() && st.peek()[0] < current){
                int [] prev = st.pop();
                res[prev[1]] = i - prev[1];
            }
            
            st.add(new int[]{current, i});
        }
        return res;
    }
}