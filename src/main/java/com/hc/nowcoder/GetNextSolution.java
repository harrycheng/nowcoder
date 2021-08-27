package com.hc.nowcoder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class GetNextSolution {

    public static void main(String[] args) {
        BinarySearchTreeConvert bst = new BinarySearchTreeConvert();
        int[] preOrder = {8, 6, 5, 7, 10, 9, 11};

        int[] inOrder = {5, 6, 7, 8, 9, 10, 11};
        TreeLinkNode t = bst.construct(preOrder, inOrder);

        GetNextSolution gs = new GetNextSolution();
        System.out.println(gs.GetNext(t).val);

    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }

        TreeLinkNode root = pNode;
        while (root.next != null) {
            root = root.next;
        }
        Stack<TreeLinkNode> stack = new Stack<>();

        List<TreeLinkNode> array = new LinkedList<>();
        TreeLinkNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
                continue;
            } else {
                TreeLinkNode top = stack.pop();
                array.add(top);
                p = top.right;
            }
        }

        array.stream().forEach(item -> System.out.println(item.val));

        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i).val == pNode.val) {
                return array.get(i + 1);
            }
        }
        return null;
    }

}
