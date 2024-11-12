public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.println(Arrays.toString(result1)); // 预期输出: [24, 12, 8, 6]

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.println(Arrays.toString(result2)); // 预期输出: [0, 0, 9, 0, 0]
    }
}
