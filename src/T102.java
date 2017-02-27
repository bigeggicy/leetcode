import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by bigegg on 2016/12/5 0005.
 */
public class T102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if(root==null)return res;
        queue.offer(root);
        int a;
        while(!queue.isEmpty()){
            a=queue.size();
            List<Integer> subl=new LinkedList<>();
            for(int i=0;i<a;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subl.add(queue.poll().val);
            }
            res.add(subl);
        }

        return res;
    }

}
