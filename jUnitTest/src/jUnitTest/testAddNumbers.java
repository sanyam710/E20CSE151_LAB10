package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		
		jUnitFunction JUnit=new jUnitFunction();
		int result=JUnit.AddNumber(100,200);
		assertEquals(300,result);
		
	}

}
