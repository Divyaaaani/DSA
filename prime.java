class prime {
    public boolean isPrime(int n) {

        if (n <= 1) return false;

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 2;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPrime(7)); // true
        System.out.println(sol.isPrime(10)); // false
    }
}

