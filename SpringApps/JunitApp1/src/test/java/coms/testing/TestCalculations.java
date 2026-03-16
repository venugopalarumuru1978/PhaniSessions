package coms.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import coms.development.Calculations;
import junit.framework.Assert;

public class TestCalculations {

	static Calculations c1 = null;
	
	@BeforeClass
	public static void initClass()
	{
		c1 = new Calculations();
		System.out.println("Before Class Method");
	}
	
	@AfterClass
	public static void enditClass()
	{
		c1 = null;
		System.out.println("After Class Method");
	}

	@Before
	public void init()
	{
		//c1 = new Calculations();
		System.out.println("Before Method");
	}
	
	@After
	public void endit()
	{
		//c1 = null;
		System.out.println("After Method");
	}

	@Test
	public void testAdditionPos()
	{
		System.out.println("POS");
		int actVal = c1.Addition(10, 20);
		int expVal = 30;
		Assert.assertEquals(expVal, actVal);
	}
	@Test
	public void testAdditionNeg()
	{
		System.out.println("Neg");
		int actVal = c1.Addition(-10, -20);
		int expVal = -30;
		Assert.assertEquals(expVal, actVal);
	}
	
	@Test
	public void testAddition()
	{
		System.out.println("POS-NEG");
		int actVal = c1.Addition(-10, 20);
		int expVal = 10;
		Assert.assertEquals(expVal, actVal);
	}
	
	@Test
	public void testFindMin()
	{
		System.out.println("Min");
		int actVal = c1.findMin(new int[] {10,20,3,1,11});
		int expVal = 1;
		Assert.assertEquals(expVal, actVal);
	}
	/*
	@Test(timeout=2000)
	public void PerformanceTest()
	{
		for(int i=1;i<=1000000;i++) {
			System.out.println(i);
		}
		System.out.println("Loop Done");
	}
	*/
	@Test(expected= ArithmeticException.class)
	public void TestException()
	{
		c1.exception(0);	
	}

}
