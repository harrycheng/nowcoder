package com.hc.nowcoder;

import java.util.List;

public class CommonPrint {
	public static void print(List list) {
		for(Object item: list) {
			System.out.print(item);
		}
		System.out.println(" ");
	}
}
