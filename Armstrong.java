class Armstrong {
    public static boolean Armstrong(int x) {
      

        int sum = 0, rem;
        int y = x;
        while (x > 0) {
            rem = x % 10;
            sum= sum + (rem*rem*rem);
            x = x / 10;
        }
        if (sum == y)
        return true ;
        else 
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Armstrong(153)); // call directly
    }
}
