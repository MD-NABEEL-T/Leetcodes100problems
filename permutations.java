import java.util.*;

public class permutations {
    public static void main(String[] args) {
        int[] nums = {1,4};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], res);
        return res;
    }

    public static void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> res) {
        // base case: if current list size == nums length, we found a permutation
        if (current.size() == nums.length) {
            res.add(new ArrayList<>(current)); // add a copy of current
            return;
        }

        // explore all numbers
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // skip if already used

            // choose
            used[i] = true;
            current.add(nums[i]);

            // explore
            backtrack(nums, current, used, res);

            // un-choose (backtrack)
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
