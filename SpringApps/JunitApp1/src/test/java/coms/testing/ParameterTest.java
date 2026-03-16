package coms.testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import coms.development.Calculations;
import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ParameterTest {

	Calculations c1= new Calculations();
	private int fVal;
	private int sVal;
	private int expVal;
	
	public ParameterTest(int fVal, int sVal, int expVal)
	{
		System.out.println("Constructor");
		this.fVal = fVal;
		this.sVal = sVal;
		this.expVal = expVal;
	}
	
	 @Parameters
	   public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] { { 10, 20, 30 }, { -10, -20, -30 },{-10,20, 10} });
	    }
	
	@Test
	public void testAdditionPos()
	{
		System.out.println("POS");
		int actVal = c1.Addition(fVal, sVal);		
		Assert.assertEquals(this.expVal, actVal);
	}
	
}
