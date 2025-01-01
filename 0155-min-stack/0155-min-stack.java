import java.util.Stack;

class MinStack {

    private Stack<Integer> normal ;
    private Stack<Integer> wanted;

    public MinStack() {
        normal = new Stack<>();
        wanted = new Stack<>();
    }

    public void push(int val) {
        if (!normal.isEmpty() && !wanted.isEmpty()){
            normal.push(val);
            if (wanted.peek() < val)
                wanted.push(wanted.peek());
            else 
                wanted.push(val);
        }
        else {
            normal.push(val);
            wanted.push(val);
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