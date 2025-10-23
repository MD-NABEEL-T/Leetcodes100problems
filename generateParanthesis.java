class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n, n, "", res);
        return res;
    }

    public void helper(int left, int right, String str, List<String> res) {
        if (left < 0 || right < 0 || left > right) return;  // invalid state
        
        if (left == 0 && right == 0) {  // all used up
            res.add(str);
            return;
        }

        helper(left - 1, right, str + "(", res);  // use one '('
        helper(left, right - 1, str + ")", res);  // use one ')'
    }
}

// close < open
/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]*/