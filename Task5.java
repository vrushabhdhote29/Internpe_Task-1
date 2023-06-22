package Internpe.Task1;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 5};
        int nonUniqueDuplicate = findNonUniqueDuplicate(arr);
        if (nonUniqueDuplicate != -1) {
            System.out.println("Non-unique duplicate found: " + nonUniqueDuplicate);
        } else {
            System.out.println("No non-unique duplicate found.");
        }
    }
        public static int findNonUniqueDuplicate(int[] nums) {
                Arrays.sort(nums);
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] == nums[i - 1]) {
                        return nums[i];
                    }
                }
                return -1;
        }
}
