import java.util.*;

/**
 * Created by bigegg on 2016/10/31 0031.
 */
public class practice {
    public static String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] sa=s.toCharArray();
        while(i<j){
            while(i<s.length()&&!isVowel(sa[i]))i++;
            while(j>=0&&!isVowel(sa[j]))j--;
            if(i>=j)break;
            char temp=sa[i];
            sa[i]=sa[j];
            sa[j]=temp;
            i++;
            j--;
        }
        return new String(sa);
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static String getHint(String secret, String guess) {
        char[] s=secret.toCharArray();
        char[] g=guess.toCharArray();
        int c1=0,c2=0;
        int[] hash=new int[10];
         for(int i=0;i<secret.length();i++){
            if(s[i]==g[i])c1++;
             hash[s[i]-'0']++;
        }
        for(int i=0;i<secret.length();i++){
            if(hash[g[i]-'0']>0){c2++;hash[g[i]-'0']--;}
        }
        return c1+"A"+(c2-c1)+"B";
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null&&sum==0)return true;
        if(root==null&&sum!=0)return false;
        if(root.val==sum&&root.left==null&&root.right==null)return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode start=new ListNode(-1);
        start.next=head;
        ListNode p=start;
        while(p.next!=null){
            if(p.next.val==val){
                p.next=p.next.next;
            }
            else p=p.next;
        }
        return start.next;
    }

    public static int findRadius(int[] houses, int[] heaters) {
        int count=0,max=0;
        int j=0;
        for(int i=0;i<houses.length;i++){
            if(houses[i]!=heaters[j])count++;
            else {
                max=Math.max(count,max);
                count=0;
                if(j<heaters.length-1)j++;
            }
            if(i==houses.length-1){
                max=Math.max(count,max);
            }
        }
        return (max+1)/2;
    }

    public static int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.",-1);
        String[] v2=version2.split("\\.",-1);
        //if(v1.equals(v2))return 0;
        int i=0,j=0;
        int n1=v1.length,n2=v2.length;
        while(i<n1&&j<n2){
            int N1=Integer.parseInt(v1[i]);
            int N2=Integer.parseInt(v2[j]);
            if(N1>N2)return 1;
            else if(N1<N2)return -1;
            i++;
            j++;
        }
        while(i<n1){
            int N1=Integer.parseInt(v1[i]);
            if(N1!=0)return 1;
        }
        while(j<n2){
            int N2=Integer.parseInt(v2[j]);
            if(N2!=0)return -1;
        }
        return 0;
    }

    public static int numberOfArithmeticSlices(int[] A) {
        int curr = 0, sum = 0;
        for (int i=2; i<A.length; i++)
            if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
                curr += 1;
                sum += curr;
            } else {
                curr = 0;
            }
        return sum;
    }

    public int[][] reconstructQueue(int[][] people) {
        List<int[]> res = new ArrayList<int[]>();

        return res.toArray(new int[people.length][]);
    }

    public static int[] singleNumber(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        for(int i:nums){
            if(a.contains(i))a.remove(i);
            else a.add(i);
        }
        int[] res=new int[2];
        int i=0;
        for(int j:a){
            res[i]=j;
            i++;
        }
        return res;
    }

    public static int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];
            for (int i = 0, tmp = 1; i < nums.length; i++) {
                result[i] = tmp;
                tmp *= nums[i];
            }
            for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
                result[i] *= tmp;
                tmp *= nums[i];
            }
            return result;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }

    static class myCmp implements Comparator<Map.Entry<Character,Integer>>{
        @Override
        public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
            return  o2.getValue() - o1.getValue();
        }
    }
    public static String frequencySort(String s) {
        Map<Character, Integer> counterMap = new HashMap<>();
        char[] sArray=s.toCharArray();
        for(char num : sArray) {
            int count = counterMap.getOrDefault(num, 0);
            counterMap.put(num, count+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(counterMap.entrySet());
        Collections.sort(list,new myCmp());
        StringBuffer buffer = new StringBuffer();
        for(Map.Entry<Character,Integer> entry : list){
            for(int i = 0; i < entry.getValue(); i++){
                buffer.append(entry.getKey());
            }
        }
        return buffer.toString();

    }


    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n - 1][n - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int count = getLessEqual(matrix, mid);
            if (count < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }

    public static int getLessEqual(int[][] matrix, int val) {
        int res = 0;
        int n = matrix.length, i = n - 1, j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > val) i--;
            else {
                res += i + 1;
                j++;
            }
        }
        return res;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        helper(root, res);
        return res;
    }

   public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }

    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=A[i]+B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                count+=map.getOrDefault(-1 * (C[i]+D[j]), 0);
            }
        }
        return count;
    }

    public static int[] findRightInterval(Interval[] intervals) {
        int n;
        if (intervals == null || (n = intervals.length) == 0) return new int[]{};

        int[] res = new int[intervals.length];
        Interval[] sintervals = new Interval[n];

        // sintervals don't have any use of 'end', so let's use it for tracking original index
        for (int i = 0; i < n; ++i) {
            sintervals[i] = new Interval(intervals[i].start, i);
        }

        // sort
        Arrays.sort(sintervals, (a, b)->a.start-b.start);

        int i = 0;
        for (; i < n; ++i) {
            int key = intervals[i].end;
            // binary search in sintervals for key
            int l = 0, r = n - 1;
            int right = -1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (sintervals[m].start == key) {
                    right = sintervals[m].end; // original index is stored in end
                    break;
                } else if (sintervals[m].start < key) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }

            // if we haven't found the key, try looking for 'start' that's just greater
            if ((right == -1) && (l < n) && (sintervals[l].start > key)) {
                right = sintervals[l].end; // original index is stored in end
            }

            res[i] = right;
        }

        return res;


    }


    public static void main(String args[]){
        //int[] a={1,2,3,4,4};
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };

        //ListNode l1=new ListNode(-1);
        System.out.print(kthSmallest(matrix,3));
    }

}


