import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Number of array elements
            int[] arr = new int[N];

            // Read the array elements
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            // Check if the array can be converted to a palindrome
            boolean canBePalindrome = isPossiblePalindrome(arr);

            // Output the result
            if (canBePalindrome) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }

    // Function to check if the array can be converted to a palindrome
    public static boolean isPossiblePalindrome(int[] arr) {
        int oddCount = 0;

        // Count the number of odd elements
        for (int num : arr) {
            if (num % 2 == 1) {
                oddCount++;
            }
        }

        // An array can be converted to a palindrome if it has at most one odd element
        return oddCount <= 1;
    }
}
