/**
 * Created by bigegg on 2016/10/28 0028.
 */

public class Climbing70 {
    public static int climbStairs(int n) {
        int count =0;
        if(n<=1)return n;
        int x=0;
        while(x<n){
            if((n-x)%2==0){
                count+=grade(n-1)/(grade((n-x)/2)*grade(n-1-(n-x)/2));//错误的
            }
            x++;
        }
        return count;
    }

    public static long grade(int x){
        long y=1;
        for(int i=1;i<=x;i++)
            y=y*i;
        return y;

    }
    public static void main(String args[]){
        System.out.print(Climbing70.climbStairs(3));
    }
}
