using System.Text;

public class Solution
{
    public string MinRemoveToMakeValid(string s)
    {
        StringBuilder sb = new(s);
        int leftParenthesesCount = 0;
        for (int i = 0; i < sb.Length; i++)
        {
            if (sb[i] == ')' && leftParenthesesCount == 0)
            {
                sb = sb.Remove(i, 1);
                i--;
            }
            else if (sb[i] == '(')
            {
                leftParenthesesCount++;
            }
            else if (sb[i] == ')' && leftParenthesesCount > 0)
            {
                leftParenthesesCount--;
            }
        }//lee(t(c)o)de)                a)b(c)d               ))((
        if (leftParenthesesCount > 0)
        {
            for (int i = sb.Length - 1; i >= 0; i--)
            {
                if (sb[i] == '(' && leftParenthesesCount != 0)
                {
                    sb = sb.Remove(i, 1);
                    leftParenthesesCount--;
                }
            }
        }
        return sb.ToString();
    }
}