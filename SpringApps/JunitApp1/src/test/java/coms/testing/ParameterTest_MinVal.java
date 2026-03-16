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
public class ParameterTest_MinVal {

	Calculations c1= new Calculations();
	
	private int x[];	
	private int expVal;
	
	public ParameterTest_MinVal(int x[], int expVal)
	{
		System.out.println("Constructor");
		this.x = x;
		this.expVal = expVal;
	}
	
	 @Parameters
	   public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] 
	        		{ { new int[] {10,2,4}, 2 }, { new int[] {1,2,4}, 1 } });
	    }
	
	   @Test
		public void testFindMin()
		{
			System.out.println("Min");
			int actVal = c1.findMin(x);
			Assert.assertEquals(this.expVal, actVal);
		}
}
