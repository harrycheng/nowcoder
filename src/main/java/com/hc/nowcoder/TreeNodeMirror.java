package com.hc.nowcoder;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeMirror {
    public TreeNode Mirror_recursion(TreeNode pRoot) {
        // write code here
        if (pRoot == null) {
            return null;
        }

        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;

        Mirror_recursion(pRoot.left);
        Mirror_recursion(pRoot.right);
        return pRoot;
    }

    public TreeNode Mirror_notrecursion(TreeNode pRoot) {
        // write code here
        if (pRoot == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while ( !queue.isEmpty()){

           TreeNode cur =  queue.poll();
            TreeNode temp =  cur.left;
            cur.left = cur.right;
            cur.right = temp;

            if(cur.left!=null){
                queue.add(cur.left);
            }


            if(cur.right!=null){
                queue.add(cur.right);
            }
        }
        return pRoot;
    }
}
