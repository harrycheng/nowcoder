package com.hc.nowcoder;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
	
	public void testConstructTree() {
		BinarySearchTreeConvert bsc = new BinarySearchTreeConvert();
		TreeNode root = bsc.construct(new int[] { 5, 3, 2, 4, 7, 6, 8 },  new int[] { 2, 3, 4, 5, 6, 7, 8 });
		bsc.prePrint(root);
		System.out.println("");
		bsc.inPrint(root);

		System.out.println("");
		TreeNode list = bsc.Convert(root);
		System.out.println("list:");
		bsc.linkPrint(list);
	}
	
	public void testCountTree() {
		BinarySearchTreeConvert bsc = new BinarySearchTreeConvert();
		TreeNode root = bsc.construct(new int[] { 5, 3, 2, 4, 7, 6, 8 },  new int[] { 2, 3, 4, 5, 6, 7, 8 });
		
		TreeDepthClass treeDepthClass = new TreeDepthClass();
		int count = treeDepthClass.TreeDepth(root);
		assertEquals(3, count);
	}
}
