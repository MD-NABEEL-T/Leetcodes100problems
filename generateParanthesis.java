// example 
// List<String> res = new ArrayList<>();
// res.add("()");
// res.add("(())");

// System.out.println(res);
// output:[(), (())]

import java.util.*;

public class generateParenthesis {
    public static void main(String[] args) {
        int n = 3; 
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        // It’s a dynamic array, meaning it grows automatically as you add more elements.
        helper(n, n, "", res);
        return res;
    }

    public static void helper(int left, int right, String current, List<String> res) {
        // if invalid state
        if (left < 0 || right < 0 || left > right) return;

        // if all parentheses are used
        if (left == 0 && right == 0) {
            res.add(current);
            return;
        }

        // add '(' if available
        helper(left - 1, right, current + "(", res);

        // add ')' if available
        helper(left, right - 1, current + ")", res);
    }
}


// close < open
/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]*/