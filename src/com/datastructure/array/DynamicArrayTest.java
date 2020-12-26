package com.datastructure.array;

import static org.junit.Assert.*;

import org.junit.Test;


public class DynamicArrayTest {

	@Test
	public void Test(){
		DynamicArray da = new DynamicArray<Integer>(2);
		assertEquals(da.isEmpty(),true);
		da.add(2);
		assertEquals(da.isEmpty(),false);
		da.clear();
		assertEquals(da.isEmpty(), true);
	}

}
