package Easy;


public class LeetCode852 {
    public static void main(String[] args) {
        int[] arr = { 0,10,5,2 };
        System.out.println(search(arr));
    }

    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;                
            } else {
                end = mid;
            }
        }
        return start;
    }
}