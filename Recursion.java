class Recursion {

     public static void main(String[] args) {
        Recursion sol = new Recursion();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(sol.isPalindrome(s1)); // true
        System.out.println(sol.isPalindrome(s2)); // false
    }

 
    public boolean isPalindrome(String s) {
        return check(s.toLowerCase(), 0, s.length() - 1);
    }

    private boolean check(String s, int l, int r) {

        // base case
        if (l >= r) return true;

        // skip non-alphanumeric from left
        if (!Character.isLetterOrDigit(s.charAt(l)))
            return check(s, l + 1, r);

        // skip non-alphanumeric from right
        if (!Character.isLetterOrDigit(s.charAt(r)))
            return check(s, l, r - 1);

        // compare characters
        if (s.charAt(l) != s.charAt(r))
            return false;

        return check(s, l + 1, r - 1);
    }
}
