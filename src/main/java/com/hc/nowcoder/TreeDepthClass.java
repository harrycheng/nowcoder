package com.hc.nowcoder;

import java.lang.Math;
public class TreeDepthClass {
    public int TreeDepth(TreeLinkNode root) {
    	int count = 0;
    	return countDepth(root, count);
    }

	private int countDepth(TreeLinkNode root, int count) {
		if(root == null) {
			return count;
		} 
		
		return Math.max( countDepth(root.left, count + 1), countDepth(root.right, count + 1) );			
	}
}
