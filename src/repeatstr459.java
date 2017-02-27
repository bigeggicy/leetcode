/**
 * Created by bigegg on 2016/12/7 0007.
 */
public class repeatstr459 {
    public static boolean repeatedSubstringPattern(String str) {
        int i=1,j=0,n=str.length();
        char[] s=str.toCharArray();
        int[] kmp=new int[n+1];
        while(i<n){
            if(s[i]==s[j])kmp[++i]=++j;
            else if(j==0)i++;
            else j=kmp[j];
            for(int c:kmp)System.out.print(c+" ");
            System.out.println();
        }
        return kmp[n]>=0&&kmp[n]%(n-kmp[n])==0;
    }
    public static void main(String args[]){

        System.out.print(repeatedSubstringPattern("abcabcabc"));
    }

}
