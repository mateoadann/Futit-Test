package exercise3;

public class MoveNonZeroElements {
    public static int moveNonZero(int[] nums) {
        int left = 0, right = nums.length - 1, count = 0;

        while (left <= right) {
            while (left <= right && nums[left] != 0) {
                left++;
                count++;
            }
            while (left <= right && nums[right] == 0) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -2, 0, 0, 3, 4, 0, 0};
        int result = moveNonZero(arr);
        System.out.println("Number of non-zero elements: " + result);
    }
}
