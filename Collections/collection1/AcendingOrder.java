package com.yash.collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//1)WAP to sort Collection elements in ascending order.
public class AcendingOrder {

	public static void main(String[] args) {
		String a[] = new String[] { "Z", "X", "B", "F", "A" };
		List<String> list = Arrays.asList(a);
		Collections.sort(list);
		System.out.println("Elements in ascending order:" + list);
	}

}
