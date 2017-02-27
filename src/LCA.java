
/**
 * Created by bigegg on 2016/10/31 0031.
 */

public class LCA {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a=p.val;
        int b=q.val;
        if(a==b)return p;
        if(a<b)return helper(root,a,b);
        else return helper(root,b,a);
    }

    public TreeNode helper(TreeNode root, int a,int b){
        if(root.val>=a&&root.val<=b)return root;
        else if(root.val>b)return helper(root.left,a,b);
        return helper(root.right,a,b);
    }
}
