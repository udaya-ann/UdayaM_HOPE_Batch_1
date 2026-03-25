import java.util.Scanner;

public class Leetcode941 {
     public static boolean validMountainArray(int[] arr) {

        int n = arr.length;
        int i = 0;
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) {
            return false;
        }
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = validMountainArray(arr);

        if (result) {
            System.out.println("Valid Mountain Array");
        } else {
            System.out.println("Not a Mountain Array");
        }

        sc.close();
    }
}
