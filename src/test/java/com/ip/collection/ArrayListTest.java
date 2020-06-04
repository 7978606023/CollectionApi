package com.ip.collection;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayListTest {

	private List<String> list;
	
	@BeforeTest
	public void setUp(){
		list = new ArrayList<String>();
	}
	
	@Test
	public void testListInit(){
		Assert.assertTrue(list.isEmpty());
		Assert.assertTrue(list.size() == 0);
	}
	
	
	@Test
	public void testSetElement(){
		list.add(0, "Karol");
		list.add(1, "Vanessa");
		list.add(2, "Amanda");
		
		list.set(1, "Livia");
		
		Assert.assertEquals("Karol", list.get(0));
		Assert.assertEquals("Livia", list.get(1));
		Assert.assertEquals("Amanda", list.get(2));
	}
	
	@Test
	public void testRemoveElement(){
		list.add(0, "Karol");
		list.add(1, "Vanessa");
		list.add(2, "Amanda");
		
		Assert.assertEquals("Amanda", list.remove(2));
		Assert.assertTrue(list.size() == 2);
	}

}
