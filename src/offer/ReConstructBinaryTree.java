package offer;

/*
* 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
* 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*
* */
public class ReConstructBinaryTree {

    public static void main(String[] args) {
        int pre[] = {1,2,4,7,3,5,6,8};
        int in[]={4,7,2,1,5,3,8,6};
        TreeNode treeNode = reConstructBinaryTree(pre, in);
        //测试 前序遍历
        preSearch(treeNode);
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length<=0 || in.length<=0)
        {
            return  null;
        }
        return Construct(pre,0,pre.length-1,in,0,in.length-1);

    }

    private  static TreeNode Construct(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if(startPre>endPre || startIn>endIn)
        {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        int inRootNum ; //中序遍历的root的位置
        for(int i =0;i<in.length;i++)
        {
            if(pre[startPre]==in[i])
            {
                root.left=Construct(pre,startPre+1,startPre+i,in,startIn,i-1);
                root.right=Construct(pre,i-startIn+startPre+1,endPre,in,i+1,endIn) ;
                break;
            }
        }
        return root;

    }

    public  static  void  preSearch (TreeNode treeNode){
        System.out.print(treeNode.val+" ");
        if(treeNode.left!=null)
        {
            preSearch(treeNode.left);
        }
        if(treeNode.right!=null)
        {
            preSearch(treeNode.right);
        }

    }
}


class TreeNode{
    int val ;
    TreeNode left =null;
    TreeNode right =null;

    public TreeNode(int val) {
        this.val = val;
    }
}