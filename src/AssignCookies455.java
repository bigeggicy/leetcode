import java.util.Arrays;

/**
 * Created by bigegg on 2016/11/30 0030.
 */
public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n1=g.length,n2=s.length;
        int i=0,j=0,count=0;
        while(i<n1&&j<n2){
            if(g[i]<=s[j]){
                i++;
                j++;
                count++;
            }
            else j++;
        }
        return count;
    }
}
