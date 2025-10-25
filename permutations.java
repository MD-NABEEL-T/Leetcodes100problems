import java.util.*;

public class permutations {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void f(int[] nums, List<List<Integer>> result, int idx) {
        if (idx == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for (int el : nums) {
                perm.add(el);
            }
            result.add(perm);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, i, idx);
            f(nums, result, idx + 1);
            swap(nums, i, idx); // backtrack
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        f(nums, result, 0);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }
}
