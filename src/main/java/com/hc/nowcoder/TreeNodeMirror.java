package com.hc.nowcoder;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeMirror {
    public TreeLinkNode Mirror_recursion(TreeLinkNode pRoot) {
        // write code here
        if (pRoot == null) {
            return null;
        }

        TreeLinkNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;

        Mirror_recursion(pRoot.left);
        Mirror_recursion(pRoot.right);
        return pRoot;
    }

    public TreeLinkNode Mirror_notrecursion(TreeLinkNode pRoot) {
        // write code here
        if (pRoot == null) {
            return null;
        }

        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while ( !queue.isEmpty()){

           TreeLinkNode cur =  queue.poll();
            TreeLinkNode temp =  cur.left;
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
