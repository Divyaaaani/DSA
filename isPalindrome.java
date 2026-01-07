// //returns boolean 
// class isPalindrome {
//     public static boolean isPalindrome(int x) {
//         if (x < 0) 
//         return false;

//         else{
//             int rev = 0, rem;
//         int y = x;
//         while (x > 0) {
//             rem = x % 10;
//             rev = rev * 10 + rem;
//             x = x / 10;
//         }
//         return rev == y;
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(isPalindrome(1221)); // call directly
//     }
// }


import java.lang.*;
class isPalindrome{
    static boolean isPalindrome(int n){
        int m =n;
        int rev=0;
        while(n>0){
        int lastdigit= n%10;
        rev= rev * 10 + lastdigit;
        n=n/10;
        }
        return rev==m;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(1261));
    }
}