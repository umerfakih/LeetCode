package Easy;

public class LeetCode1295 {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        System.out.println(iterate(arr));
    }

    static int iterate(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (checkEvenNumber(element)) {
                count++;
            }
        }
        return count;
    }

    static boolean checkEvenNumber(int num) {
        int numOfDigits = digits(num);
        if(numOfDigits % 2 == 0 ){
            return true;
        }
        else{
            return false;
        }
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}