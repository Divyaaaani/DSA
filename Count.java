// count the number of digits TC= O(log 10(n))
import java.lang.*;
class count {
    static int countDigit(int n) {
    int count=0;
       while(n>0){
        n=n/10;
         count++;
       }return count;
    }
    public static void main(String[] agrs){
        System.out.println(countDigit(2323134));
    } 
}