package Medium;

public class InfiniteArrayQuestion {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 25, 26, 30, 40 };
        int target = 20;
        int start = 0;
        int end = 1;

        while (arr[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        int result = search(arr, target, start, end);
        System.out.println(result);
    }

    static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}