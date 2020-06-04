package com.ip.collection;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayListExaTest {
	
	ArrayListExa arraylistexa = null;
	@BeforeTest
	public void setUp() {
		arraylistexa = new ArrayListExa();
	}
	   @Test
	    public void testMyArray() {

	       Assert.assertEquals(Arrays.asList("Customer1", "Customer2", "Customer3"), arraylistexa.myArray());
	    }
	   
	   //@Test
	   public void myArrayTest()    {
	       List<String> result = arraylistexa.myArray();
	      // Assert.assertNotNull("List shouldn't be null", result);
	      // Assert.assertEquals("wrong size", 3, result.size());
	       Assert.assertEquals("Wrong 1st element", "Customer1", result.get(0));
	       Assert.assertEquals("Wrong 2nd element", "Customer2", result.get(1));
	       Assert.assertEquals("Wrong 3rd element", "Customer3", result.get(2));
	   }
	}

