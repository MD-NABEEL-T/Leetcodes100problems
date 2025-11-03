import java.util.*;
public class subsets{
    public static void subset(int[] nums, int idx, List<Integer> curr) {
        if (idx == nums.length) {
            System.out.println(curr);
            return;
        }

        // include current element
        curr.add(nums[idx]);
        subset(nums, idx + 1, curr);

        // exclude current element
        curr.remove(curr.size() - 1);
        subset(nums, idx + 1, curr);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<Integer> newArr=new ArrayList<>();
        subset(nums, 0, newArr);
    }
}
//                    []
//                 /      \
//           [1]             []
//         /    \          /    \
//     [1,2]   [1]      [2]     []
//     /   \   /  \     /  \    / \
// 123 12 13 1 23  2   3   []
