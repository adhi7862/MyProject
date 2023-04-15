package com.staragile;
import junit.framework.Assert;
import org.junit.Test;
public class CalculatorTest {

	

		@Test
		public void testSum() {
			calculator cal = new calculator();
			Assert.assertEquals(4, cal.sum(2,2));
		}
		@Test
		public void testsubtract() {
			calculator cal = new calculator();
			Assert.assertEquals(4, cal.sum(2,2));
		}
		@Test
		public void testmultiply() {
			calculator cal = new calculator();
			Assert.assertEquals(4, cal.sum(2,2));
		}
		@Test
		public void testdivision() {
			calculator cal = new calculator();
			Assert.assertEquals(4, cal.sum(2,2));
		}
		
}	