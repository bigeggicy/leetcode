/**
 * Created by bigegg on 2016/12/5 0005.
 */
public class T434 {
    public static int countSegments(String s) {
        int res=0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
                res++;
        return res;
    }



    public static void main(String args[]){
        System.out.print(countSegments("Hello, my name is John"));
    }
}
