package offer.tree;

import java.util.ArrayList;
import java.util.Queue;

/*
* 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class PrintFromTopToBottom {


    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
        {
           return  new ArrayList<Integer>();
        }
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (queue.size()!=0)
        {
            TreeNode node = queue.remove(0);
            if(node.left!=null)
            {
                queue.add(node.left);
            }
            if(node.right!=null)
            {
                queue.add(node.right);
            }
            integers.add(node.val);
        }
        return integers;
    }
}
