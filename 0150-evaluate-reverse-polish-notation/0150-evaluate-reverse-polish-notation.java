import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack<Integer> numsStack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/") && !tokens[i].isEmpty()) {
                numsStack.add(Integer.parseInt(tokens[i]));
                res = Integer.parseInt(tokens[i]);
            }
            else if (tokens[i].equals("+") && numsStack.size() > 1) {
                int temp = numsStack.pop();
                res = numsStack.pop() + temp;
                numsStack.add(res);
            }
            else if (tokens[i].equals("-") && numsStack.size() > 1) {
                int temp = numsStack.pop();
                res = numsStack.pop() - temp;
                numsStack.add(res);
            }
            else if (tokens[i].equals("*") && numsStack.size() > 1) {
                int temp = numsStack.pop();
                res = numsStack.pop() * temp;
                numsStack.add(res);
            }
            else if (tokens[i].equals("/") && numsStack.size() > 1) {
                int temp = numsStack.pop();
                res = numsStack.pop() / temp;
                numsStack.add(res);
            }
        }
        return res;
    }
}
