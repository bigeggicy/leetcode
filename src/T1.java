import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * User: bigegg.
 * Date: 2017/2/28.
 * Time: 20:29.
 */
public class T1 {

        public static int[] twoSum(int[] nums, int target) {
            int n=nums.length;
            HashMap<Integer,Integer> helper=new HashMap<>();
            for(int i=0;i<n;i++){
                if(helper.containsKey(target-nums[i])){
                    int left = helper.get(target-nums[i]);
                    return new int[]{left,i};
                }
                else{
                    helper.put(nums[i],i);
                }
            }
            return new int[2];
        }

    public static String longestPalindrome(String s) {
            int start=0,end=0;
        int n=s.length();
        int len=0;
        if(n<=1)return s;
        for(int i=0;i<n-1;i++){
            int len1=isPalindrome(s,i,i);
            int len2=isPalindrome(s,i,i+1);
            int temp=Math.max(len1,len2);
            if(temp>len){
                len=temp;
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end);
    }


    public static int  isPalindrome(String s, int begin, int end){
        while(begin<end&&(s.charAt(begin++)==s.charAt(end--))){
        }
        return end-begin-1;
    }



    public static int  a(int b){
        Integer[] a={1,2,3};
        List<Integer> a1= Arrays.asList(a);
        Collections.reverse(a1);  //no thanks 可是我也知道了啊
        return 1;

    }

    public static void main(String args[]){
            int[] a={1,2,3};
           System.out.print(longestPalindrome("babad"));
       }

}
