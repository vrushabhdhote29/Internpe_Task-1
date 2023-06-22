package Internpe.Task1;

public class Task4 {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[j];
                }
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        int duplicate = findDuplicate(arr);

        if (duplicate != -1) {
            System.out.println("Duplicate found: " + duplicate);
        } else {
            System.out.println("No duplicate found.");
        }
    }
}
