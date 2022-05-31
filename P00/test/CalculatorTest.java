import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected, actual);
				
	}
	
	public void testSubtract() {
	    int a = 1234;
	    int b = 234;
	    
	    Calculator cal = new Calculator();
	    int actual = cal.substract(a, b); 
	    
	    System.out.println("Test for Subtract");
	    int expected = 1000;
	    assertEquals (expected, actual);
	  }
	  
	  public void testMultiple() {
	    int a = 12;
	    int b = 2;
	    
	    Calculator cal = new Calculator();
	    int actual = cal.multiply(a, b); 
	    
	    System.out.println("Test for Multiplication");
	    int expected = 24;
	    assertEquals (expected, actual);
	  }
	  
	  public void testDivision() {
	    int a = 12;
	    int b = 2;
	    
	    Calculator cal = new Calculator();
	    int actual = cal.division(a, b); 
	    
	    System.out.println("Test for Division");
	    int expected = 6;
	    assertEquals (expected, actual);
	  }

}
