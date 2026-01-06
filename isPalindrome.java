//returns boolean 
class isPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) 
        return false;

        else{
            int rev = 0, rem;
        int y = x;
        while (x > 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev == y;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221)); // call directly
    }
}
