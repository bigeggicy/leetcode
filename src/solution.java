import java.util.ArrayList;
import java.util.List;

/**
 * Creted by bigegg on 2016/11/10 0010.
 */
public class  solution {
    public static List<List<Integer>> permute(int[] num) {
        List<List<Integer>> res=new ArrayList<>() ;
        backtracking(res,num, new ArrayList<Integer>() , 0);
        return res;

    }

   static void backtracking(List<List<Integer>> res, int[] nums, List<Integer> list ,int t ){
        if(list.size()== nums.length) {
            res.add(list);
            System.out.print(list);
        }
           // res.add(new ArrayList<>(list));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) continue;
                list.add(nums[i]);
                backtracking(res, nums, list, t + 1);
                list.remove(t);
            }
        }
    }

    public static void main(String args[]){
        System.out.print(solution.permute(new int[]{1,2,3}));
    }
}