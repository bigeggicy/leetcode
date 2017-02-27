/**
 * Created by bigegg on 2016/10/27 0027.
 */


import static java.lang.Math.sqrt;

public class ishappy {
    public static boolean isHappy(int n) {
        int sum=0;
        while(n>0){
            System.out.print(sqrt(n%10));
            sum+=Math.pow(n%10,2);
            n=n/10;
        }
        System.out.print(sum);
        if(sum==1||sum==7)return true;
        else if(sum<10)return false;
        else return isHappy(sum);
    }
    public static void main(String args[]){
        System.out.print(ishappy.isHappy(2));
    }
}
