public class subsetArray {
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
        subset(nums, 0, new ArrayList<>());
    }
}
