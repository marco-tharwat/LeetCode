import java.util.Objects;
import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer>s = new Stack<>();
        int sum = 0;
        for (var x : operations){
            try {
                s.push(Integer.parseInt(x));
            }catch (Exception e){
                if (x.equals("+")){
                    int temp1 = s.pop();
                    int temp2 = s.peek();
                    s.push(temp1);
                    s.push(temp1 + temp2);
                }
                else if (x.equals("D"))
                    s.push(s.peek() * 2);
                else
                    s.pop();
            }
        }
        while (!s.isEmpty())
            sum += s.pop();

        return sum;
    }
}