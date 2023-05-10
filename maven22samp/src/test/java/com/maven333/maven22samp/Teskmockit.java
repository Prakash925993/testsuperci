package com.maven333.maven22samp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Teskmockit {
	sample ob=new sample();
	
	@Test
   
   public void test()
   {
	   
	   assertEquals(5,ob.add(2,3));
   }
   @Test
   public void teststring()
   {
	   assertEquals("viswa prakash",ob.con("viswa","prakash"));
   }
   @Test
   public void tes()
   {
	  int [] arr1= {1,2,3};
	  ArrayList<Integer> obk=ob.adde(arr1);
	  assertEquals(3,obk.size());
	  assertTrue(obk.contains(1));
   }
    
}
