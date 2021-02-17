package com.hc.nowcoder;

import java.util.ArrayList;

public class KthNodeSolution {
    public static void main(String[] args) {
        BinarySearchTreeConvert bstc = new BinarySearchTreeConvert();
        TreeNode pRoot = bstc.construct(new int[]{5, 3, 2, 4, 7, 6, 8}, new int[]{2, 3, 4, 5, 6, 7, 8});

        KthNodeSolution kns = new KthNodeSolution();
        TreeNode node = kns.KthNode(pRoot, 4);
        System.out.println(" ");
        System.out.println(node.val);

    }

    public TreeNode KthNode(TreeNode pRoot, int k) {
        if(k < 1 ||  pRoot == null){
            return  null;
        }
        ArrayList<TreeNode> list = new ArrayList();
        preorder(pRoot, list);
        if(list.size() < k){
            return null;
        }
//        for(TreeNode item : list){
//            System.out.print(item.val + " ");
//        }
        return list.get(k - 1);
    }

    private void preorder(TreeNode pRoot, ArrayList<TreeNode> arrayList) {

        if (pRoot == null) {
            return ;
        }

        if (pRoot.left == null) {
            arrayList.add(pRoot);
            preorder(pRoot.right, arrayList);
        }

        if (pRoot.left != null) {
            preorder(pRoot.left, arrayList);
            arrayList.add(pRoot);
            preorder(pRoot.right, arrayList);
        }

    }
}
