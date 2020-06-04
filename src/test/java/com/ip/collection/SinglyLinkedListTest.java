package com.ip.collection;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinglyLinkedListTest {

	@Test
	public void test() {
		SinglyLinkedList testObject = new SinglyLinkedList();
		Assert.assertTrue(testObject.isEmpty());
		Assert.assertEquals(0, testObject.length());
		
		testObject.append("ABCD");
		Assert.assertFalse(testObject.isEmpty());
		Assert.assertEquals(1, testObject.length());
	}
	

}
