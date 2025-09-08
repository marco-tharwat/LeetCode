public class Solution
{
    public string MinRemoveToMakeValid(string s)
    {
        int leftParenthesesCount = 0;
        for (int i = 0; i < s.Length; i++)
        {
            if (s[i] == ')' && leftParenthesesCount == 0)
            {
                s = s.Remove(i, 1);
                i--;
            }
            else if (s[i] == '(')
            {
                leftParenthesesCount++;
            }
            else if (s[i] == ')' && leftParenthesesCount > 0)
            {
                leftParenthesesCount--;
            }
        }//lee(t(c)o)de)                a)b(c)d               ))((
        if (leftParenthesesCount > 0)
        {
            for (int i = s.Length - 1; i >= 0; i--)
            {
                if (s[i] == '(' && leftParenthesesCount != 0)
                {
                    s = s.Remove(i, 1);
                    leftParenthesesCount--;
                }
            }
        }
        return s;
    }
}