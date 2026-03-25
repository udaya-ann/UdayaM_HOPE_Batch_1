import java.util.Scanner;

public class Leetcode1295 {

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = String.valueOf(num).length();

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findNumbers(nums);

        System.out.println("Count of even-digit numbers: " + result);

        sc.close();
    }
}