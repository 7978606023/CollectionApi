package com.ip.collection;

import java.util.Collections;
import java.util.List;
import org.testng.annotations.Test;

public class IntArraysTest {

	@Test
	public void test() {

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		List<Integer> list = IntArrays.intArraysAsList(a);
		Collections.shuffle(list);

		System.out.println(list);
	}

}
