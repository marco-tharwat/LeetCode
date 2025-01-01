import java.util.Stack;

class MinStack {

    private Stack<Integer> normal ;
    private Stack<Integer> wanted;

    public MinStack() {
        normal = new Stack<>();
        wanted = new Stack<>();
    }

    public void push(int val) {
        normal.push(val);
        if (wanted.isEmpty() || val <= wanted.peek()) {
            wanted.push(val);
        } else {
            wanted.push(wanted.peek());
        }
    }

    public void pop() {
        normal.pop();
        wanted.pop();
    }

    public int top() {
        return normal.peek();
    }

    public int getMin() {
        return wanted.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */