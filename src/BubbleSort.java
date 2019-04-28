import java.util.Arrays;

public class BubbleSort {
    private static int[] bubbleSort(int[] nums){
        if(nums.length == 0){
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] >  nums[j + 1]){
                    Common.swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,9,1,7,6,8,2,12};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}
