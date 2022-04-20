package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {
	@Test
	public void test()
	{
	jUnitFunction junitstring=new jUnitFunction();
	String result=junitstring.addstring("capstone","project");
	assertEquals("capstoneproject",result);
	}

}
