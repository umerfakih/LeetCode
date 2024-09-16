package Medium;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };

        System.out.println(searchRange(nums, 8));
    }

    static  int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);
        return result;
    }

    static int search(int[] nums, int target, boolean startIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                ans = mid;
                if (startIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
