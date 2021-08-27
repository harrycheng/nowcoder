package com.hc.nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HorizonPrint {
    public ArrayList<ArrayList<Integer>> Print(TreeLinkNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();

        if(pRoot == null){
            return res;
        }
        queue.add(pRoot);
        TreeLinkNode pNode = pRoot;
        TreeLinkNode pLastAddNode = pRoot;

        ArrayList<Integer> tempList = new ArrayList<Integer>();
        while (!queue.isEmpty()){
            TreeLinkNode node = queue.poll();
            tempList.add(node.val);

            if(node.left != null){
                queue.add(node.left);
                pLastAddNode = node.left;
            }

            if(node.right!= null){
                queue.add(node.right);
                pLastAddNode = node.right;
            }

            if( node == pNode){
                res.add(tempList);
                tempList = new ArrayList<Integer>();
                pNode = pLastAddNode;
            }
        }
        return res;

//        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        if (pRoot == null) {
//            res.add(list);
//            return res;
//        }
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.add(pRoot);
//        // last 存放当前行最右节点，nlast保存最新加入队列的节点
//        TreeNode last = pRoot, nlast = pRoot;
//        while (!queue.isEmpty()) {
//            TreeNode p = queue.poll();
//            list.add(p.val);
//            if (p.left != null) {
//                queue.add(p.left);
//                nlast = p.left;
//            }
//            if (p.right != null) {
//                queue.add(p.right);
//                nlast = p.right;
//            }
//            // 当队列弹出的节点跟last节点相同，说明这一行打印完了
//            // last更新为nlast，也就是下一行的最右节点
//            if (p == last) {
//                last = nlast;
//                res.add(list);
//                list = new ArrayList<>();
//            }
//        }
//        return res;
    }

    public static void main(String[] args){
        BinarySearchTreeConvert bstc = new BinarySearchTreeConvert();
        HorizonPrint hp = new HorizonPrint();

        TreeLinkNode root =  bstc.construct(new int[]{1,2,4,5,3,6,7}, new int[]{4,2,5,1,6,3,7});
        bstc.prePrint(root);
        System.out.println(" ");

        bstc.inPrint(root);
        System.out.println(" ");

        ArrayList<ArrayList<Integer>> re = hp.Print(root);

        for(ArrayList<Integer> array : re){
            for(Integer a : array){
                System.out.print(String.format("%d ", a));
            }
            System.out.println(" ");
        }
    }
}