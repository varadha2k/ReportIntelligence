package com.chennai.reportintelligence;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mapstruct.factory.Mappers;


public class SampleTest {

	@BeforeClass
	public static void initialize() {
	}

	@Before
	public void initializeTest() {
	}	

	@Test
	public void test1() {
		assertEquals(new Long(10),Long(10));
		
	}
	 
}
