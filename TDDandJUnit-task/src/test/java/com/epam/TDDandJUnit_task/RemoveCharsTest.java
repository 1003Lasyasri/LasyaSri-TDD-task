package com.epam.TDDandJUnit_task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class RemoveCharsTest {

	/*
	 * 1.Remove - in first 2 chars  ABCD => BCD - success
	 * 2.Remove - AACD => CD - success
	 * 3.Remove - BACD => BCD - success
	 * 4.Don't remove - BBAA => BBAA - success
	 * 5.Remove only if A is in first 2 chars - AABAA => BAA - success  
	 */
	RemoveChars rem;
	 @BeforeEach
	 void SetUp()
	 {
		 rem=new RemoveChars();
	 }

	@Test
	void testAchar() {
		assertEquals("BCD",rem.remove("ABCD"));
	}
	@Test
	void testAAchar() {
		assertEquals("CD",rem.remove("AACD"));
	}
	@Test
	void testBAchar() {
		assertEquals("BCD",rem.remove("BACD"));
	}
	@Test
	void testlastAchar() {
		assertEquals("BBAA",rem.remove("BBAA"));
	}
	@Test
	void testAABAAchar() {
		assertEquals("BAA",rem.remove("AABAA"));
	}
	



}
