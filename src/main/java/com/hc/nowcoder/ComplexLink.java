package com.hc.nowcoder;

class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label) {
		this.label = label;
	}
}

public class ComplexLink {

	public void printLink(RandomListNode pHead) {
		RandomListNode p = pHead;
		while (p != null) {
			System.out.print(p.label + " ");			
			p = p.next;
		}
		
		p = pHead;
		while (p != null) {
			if(null == p.random) {
				System.out.print(" # ");
			} else {
				System.out.print(p.random.label + " ");
			}						
			p = p.next;
		}
		System.out.println(" ");
	}

	public RandomListNode Clone(RandomListNode pHead) {
		return Clone1(pHead);
	}

	public RandomListNode Clone1(RandomListNode pHead) {
		RandomListNode p = pHead;
		RandomListNode newHead = null;
		RandomListNode newTrail = null;
		
		while (null != p) {			
			RandomListNode node = new RandomListNode(p.label);
			if (newTrail == null) {
				newHead = newTrail = node;				
			} else {
				newTrail.next = node;
				newTrail = node;
			}
			p = p.next;
		}

		RandomListNode srcHead = pHead;
		RandomListNode desHead = newHead;
		while (null != srcHead && null != desHead) {
			setRandom(newHead, desHead, srcHead);	
			srcHead = srcHead.next;
			desHead = desHead.next;
		}
		return newHead;
	}

	private void setRandom(RandomListNode head, RandomListNode des, RandomListNode src) {		
		if(src == null || src.random == null) {
			return;
		}
		RandomListNode node = findNode(head, src.random.label);
		des.random = node;
	}

	public RandomListNode construct(String[] strArray) {
		RandomListNode node = null;
		RandomListNode pHead = null;
		RandomListNode pTrail = null;
		for (int i = 0; i < strArray.length / 2; i++) {
			String label = strArray[i];
			node = new RandomListNode(Integer.parseInt(label));
			if (pHead == null) {
				pHead = pTrail = node;
			} else {
				pTrail.next = node;
				pTrail = node;
			}
		}

		node = pHead;
		int index = strArray.length / 2;
		while (null != node) {
			String randomLabel = strArray[index];
			if ("#" == randomLabel) {
				node = node.next;
				index++;
				continue;
			}

			int label = Integer.parseInt(randomLabel);
			RandomListNode item = findNode(pHead, label);
			node.random = item;
			node = node.next;
			index++;
		}
		return pHead;
	}

	private RandomListNode findNode(RandomListNode pHead, int label) {
		while (null != pHead ) {
			if (pHead.label == label) {
				return pHead;
			}
			pHead = pHead.next;
		}
		return pHead;
	}

	public static void main(String[] args) {
		ComplexLink cl = new ComplexLink();
		RandomListNode src = cl.construct( new String[] { "1", "2", "3", "4", "5", "3", "5", "#", "2", "#"} );
		System.out.println("src:");
		cl.printLink(src);

		RandomListNode cp = cl.Clone(src);
		System.out.println("copy:");
		cl.printLink(cp);

	}
}
