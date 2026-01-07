// class Armstrong {
//     public static boolean Armstrong(int x) {
//         int sum = 0, rem;
//         int y = x;
//         while (x > 0) {
//             rem = x % 10;
//             sum= sum + (rem*rem*rem);
//             x = x / 10;
//         }
//         if (sum == y)
//         return true ;
//         else 
//         return false;
//     }

//     public static void main(String[] args) {
//         System.out.println(Armstrong(153)); // call directly
//     }
// }
import java.lang.*;
class Armstrong{
    public static boolean isArm(int n){
        int m=n;
        int arm=0;
        while(n>0){
            int rem=n%10;
            arm = arm+ (rem*rem*rem);
            n=n/10;
        }
        if (arm==m){
            return true;
        }else
        return false;
    }
    public static void main(String[] args){
        System.out.println(isArm(3442));
    }
}