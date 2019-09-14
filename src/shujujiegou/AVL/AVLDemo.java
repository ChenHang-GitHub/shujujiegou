package shujujiegou.AVL;
/*
* 平衡二叉树*/
public class AVLDemo {

    public static void main(String[] args) {
        AVL avl = new AVL();
        int arr[] = {7,3,10,12,5,1,9,2};
        for(int i=0;i<arr.length;i++)
        {
            Node node = new Node(arr[i]);
            avl.add(node);
        }
        avl.infixSearch();
        int height = avl.root.height();
        System.out.println(height);
        System.out.println(avl.root.getLeftHeight() +" "+avl.root.getRightHeight());
    }

}


class  AVL{
    Node root =null;
    public  void  add (Node node){
        if(root==null)
        {
            root = node;
        }else
        {
            root.add(node);
        }
    }


    public  Node Search(int value)
    {
        if(root==null)
        {
            return null;
        }else {
            return root.Search(value);
        }
    }

    public  Node SearchParent(int value)
    {
        if(root==null)
        {
            return  null;
        }else {
            return  root.SearchParent(value);
        }
    }

    public  void delete(int value){
        Node target = Search(value);
        if(target==null)
        {
            System.out.println("未找到");
        }

        //只有一个结点，直接null
        if(root.left==null&&root.right==null)
        {
            root=null;
            return;
        }
        Node parent = SearchParent(value);
        if(target.left==null&&target.right==null)
        {
            //删除的是叶子结点
            if(parent.left!=null&&parent.left==target)
            {
                parent.left=null;
            }else {
                parent.right=null;
            }
        }else  if(target.left!=null&&target.right!=null)
        {
            //删除有两个子结点的
            int minVal = delRightTreeMin(target.right);
            target.value = minVal;


        }else {
            if(target.left!=null)
            {
                if(parent!=null)
                {
                    if(parent.left.value==value)
                    {
                        parent.left=target.left;
                    }else {
                        parent.right=target.left;
                    }

                }else {
                    root=target.left;
                }
            } else {
                if(parent!=null)
                {
                    if(parent.left.value==value)
                    {
                        parent.left=target.right;
                    }else
                    {
                        parent.right=target.right;
                    }
                } else {
                    root=target.right;
                }
            }

        }


    }

    private int delRightTreeMin(Node node) {
        Node target = node;
        //循环的查找左子节点，就会找到最小值
        while(target.left != null) {
            target = target.left;
        }
        //这时 target就指向了最小结点
        //删除最小结点
        delete(target.value);
        return target.value;
    }


    public void infixSearch() {
        if(root==null)
        {
            System.out.println("root empty");
        }
        root.infixSearch();
        System.out.println();
    }

}



class  Node {
    int value ;
    Node left;
    Node right;
    int height;

    public Node(int value) {
        this.value = value;
    }


    //
    public  int getLeftHeight(){
        if(this.left==null)
        {
            return 0;
        }else {
            return  this.left.height();
        }

    }
    //
    public  int getRightHeight(){
        if(this.right==null)
        {
            return 0;
        }else {
            return  this.right.height();
        }

    }



    //
    public  int height(){
        return  Math.max(this.left==null?0:this.left.height(),this.right==null?0:this.right.height()) + 1;
    }

    //  add方法
    public  void  add (Node node)
    {
        if(node==null)
        {
            return;
        }

        if(node.value<this.value)
        {
            if(this.left==null)
            {
                this.left=node;
            }else
            {
                this.left.add(node);
            }
        }else {
            if(this.right==null)
            {
                this.right=node;
            }else
            {
                this.right.add(node);
            }
        }
    }

    //infix
    public  void infixSearch ()
    {
        if(this.left!=null)
        {
            this.left.infixSearch();
        }
        System.out.print(this.value+" ");

        if(this.right!=null)
        {
            this.right.infixSearch();
        }
    }

    //查找value 结点
    public   Node Search (int value){
        if(this.value==value)
        {
            return  this;
        }else  if(value<this.value)
        {
            if(this.left==null)
            {
                return null;
            }else {
                return  this.left.Search(value);
            }
        }else {
            if (this.right == null) {
                return null;
            } else {
                return  this.right.Search(value);
            }
        }
    }
    //查找value的父结点
    public  Node SearchParent (int value){
        if(this.left!=null &&this.left.value==value||this.right!=null&&this.right.value==value)
        {
            return  this;
        }else {
            if(value<this.value && this.left!=null)
            {
                return   this.left.SearchParent(value);
            }else if(value>=this.value&&this.right!=null)
            {
                return    this.right.SearchParent(value);
            }else
            {
                return null;
            }
        }
    }
}


