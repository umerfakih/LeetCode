package Easy;

public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        System.out.println(search(letters, 'c'));
    }

    static char search(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
