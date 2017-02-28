import javax.naming.ldap.HasControls;
import java.util.HashMap;

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

    public static int lengthOfLongestSubstring(String s) {

    }


    public static void main(String args[]){
            int[] a={1,2,3};
           System.out.print(twoSum(a,4)[1]);
       }

}
