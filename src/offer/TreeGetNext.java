package offer;

import java.util.HashMap;
import java.util.Map;

/*
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * */
public class TreeGetNext {


    public static TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null) {
            TreeLinkNode curr = pNode.right;
            while (curr.left != null) {
                curr = curr.left;
            }
            return curr;
        } else if (pNode.next != null) {
            TreeLinkNode curr = pNode;
            TreeLinkNode parent = pNode.next;
            while (parent != null && curr == parent.right) {
                curr = parent;
                parent = parent.next;
            }
            return parent;
        }
        return null;

    }


    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Map<Object,Object> map = new HashMap<>();
    }
}
