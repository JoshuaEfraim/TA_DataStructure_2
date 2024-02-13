import java.util.Arrays;


//this is O(n)
public class MaxValueFinder {
    public static int findMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2};
        int max = findMax(arr);
        System.out.println("Maximum value in the array: " + max);
    }
}

//O(n)
class Fibonacci {
    public static int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 8; 
        int result = nthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}

//O(n)
class ArrayCheck {
    public static boolean hasOnlyNonZeroAndNonNegative(int[] arr) {
        for (int num : arr) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2};
        boolean result = hasOnlyNonZeroAndNonNegative(arr);
        System.out.println("this contains only nonzero and nonnegative values: " + result);
    }
}