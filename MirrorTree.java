package com.Dgithub7;
/*
   Author:linrui
   Date:2019/6/11
   Content:
   操作给定的二叉树，将其变换为源二叉树的镜像。

    思路：
    先前序遍历这棵树的每个结点，如果遍历到的结点有子结点，就交换它的两个子节点，
    当交换完所有的非叶子结点的左右子结点之后，就得到了树的镜像
*/

public class MirrorTree {
    class TreeNode{
        TreeNode (){}
        TreeNode left=null;
        TreeNode right=null;
    }
    void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        //子节点为空的情况为跳出循环条件
        if (root.left == null && root.right == null) {
            return;
        }
        //其他情况下交换左右叶子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //递归开始
        if (root.left != null) {
            mirror(root.left);
        }
        if (root.right != null) {
            mirror(root.right);
        }
    }
}
