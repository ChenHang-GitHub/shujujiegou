package offer.tree;
/*
* 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class SymmetricalTree {


    boolean isSymmetrical(TreeNode pRoot)
    {
        return  isSym(pRoot,pRoot);
    }

    //前序遍历和中序遍历 一样的话 就是对称（镜像）
    private boolean isSym(TreeNode pRoot1, TreeNode pRoot2) {
        if(pRoot1==null && pRoot2==null)
        {
            return true;
        }
        if(pRoot1==null || pRoot2==null)
        {
            return false;
        }
        if(pRoot1.val!=pRoot2.val)
        {
            return false;
        }
        return  isSym(pRoot1.left,pRoot2.right) && isSym(pRoot1.right,pRoot2.left);
    }
}
