package com.hc.nowcoder;

public class BinarySearchTreeConvert {

	private TreeNode lastNode = null;
	
	public void linkPrint(TreeNode treeRoot) {    	
    	while(treeRoot != null) {      
    		System.out.print(treeRoot.val + " ");
    		treeRoot = treeRoot.right;    		
    	}    	    	    	
    	System.out.println(" ");
    }
	
	public void prePrint(TreeNode treeRoot) {    	
    	if(treeRoot != null) {      
    		System.out.print(treeRoot.val + " ");
    		prePrint(treeRoot.left);    		
    		prePrint(treeRoot.right);
    	}
    }
	
	public void inPrint(TreeNode treeRoot) {    	
    	if(treeRoot != null) {       		
    		inPrint(treeRoot.left);
    		System.out.print(treeRoot.val + " ");
    		inPrint(treeRoot.right);
    	}    	    	    	
    }
	
    public TreeNode construct(int[] preorder, int[] inorder) {    	
    	return construct(preorder, 0, preorder.length -1 , inorder, 0, inorder.length -1);    	    	    	
    }
    
    public TreeNode construct(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {    	
    	
    	if(preStart > preEnd) {    		    		
    		return null;    		    	
    	}
    	
    	int label = preorder[preStart];
		TreeNode node = new TreeNode(label);
		
    	if(preStart == preEnd) {    		    		
    		return node;
    	}
    	
		    	
    	int index = findIndex(label, inorder);
    	if(index == -1) {
    		System.out.println("Error data...");
    	}
    	int subLength = index - inStart;
    	
    	node.left =  construct(preorder, preStart + 1 , preStart + subLength, inorder, inStart, inStart + subLength - 1) ;
    	node.right =  construct(preorder, preStart + subLength + 1, preEnd , inorder, inStart + subLength + 1, inEnd) ;    	
    	return node;
    }
    
    
    private int findIndex(int searchKey, int[] inorder) {
    	for(int index = 0; index < inorder.length; index++) {
    		if(inorder[index] == searchKey) {
    			return index;
    		}
    	}
    	return -1;
	}

	public TreeNode Convert(TreeNode pRootOfTree) {		
		convertode(pRootOfTree);
		while(null != lastNode && null != lastNode.left ) {
			lastNode = lastNode.left;
		}
		
		return lastNode;
    }
    
    private void convertode(TreeNode root) {
		
    	if(root == null)
			return;
    	TreeNode current = root;    	
    	
		if(current.left != null)
			convertode(current.left);
		
		current.left = lastNode;		
		
		if(lastNode != null)
			lastNode.right = current;
		
		lastNode = current;
		
		if(current.right != null)
			convertode(current.right);
	}

  
}
