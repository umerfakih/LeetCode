package Medium;

public class LeetCode34 {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};

        System.out.println(search(nums, 8));
    }

    static int[] search(int[]nums , int target){
        int[] result = {-1, -1};
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end -start) / 2;
            
            if(target == nums[mid]){
                result[0] =mid;
                if(nums[mid] == nums[mid + 1]){
                    result [1] = mid + 1;
                } 
                else{
                    result [1] = mid  -1;
                }
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return result;
    }
}
