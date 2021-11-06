package com.company;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}

    TreeNode(int val)
    {
        this.val=val;
    }

    TreeNode(int val,TreeNode left,TreeNode right)
    {
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class Main {
    public static int sum = 0;
    public static void main(String[] args) {
	    TreeNode treeNode = new TreeNode(3);
        treeNode.left=new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        calculateSum(treeNode);
        System.out.print(sum);
    }

    public static void calculateSum(TreeNode root)
    {
        if(root==null)
            return;
        if(root.left!=null)
        sum+= root.left.val;

        calculateSum(root.left);
        calculateSum(root.right);
    }
}
