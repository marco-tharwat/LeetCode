import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == ')' && st.size() > 0){
                if (st.peek() == '(')
                    st.pop();
                else
                    st.add(c);
            } else if (c == ']' && st.size() > 0) {
                if (st.peek() == '[')
                    st.pop();
                else
                    st.add(c);
            } else if (c == '}' && st.size() > 0) {
                if (st.peek() == '{')
                    st.pop();
                else
                    st.add(c);
            }
            else
                st.add(c);
        }
        if (st.isEmpty())
            return true;

        return false;
    }
}