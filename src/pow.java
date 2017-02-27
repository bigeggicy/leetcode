/**
 * Created by bigegg on 2016/10/31 0031.
 */
public class pow {
    public static boolean isPowerOfFour(int n) {
        if(n<=0)return false;
        if((n&(n-1))!=0)return false;
        System.out.println(0x55555555);
        if((n&(0x55555555))!=0)return true;
        return false;
    }

    public static void main(String args[]){
        System.out.print(pow.isPowerOfFour(16));
    }
}
