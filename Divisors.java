import java.util.*;

class Divisors {
    public static int[] divisors(int n) {
        // First count the number of divisors
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++; // as count will give u the size of array
            }
        }

        // Create array of correct size
        int[] result = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result[index++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisors(248)));
    }
}
