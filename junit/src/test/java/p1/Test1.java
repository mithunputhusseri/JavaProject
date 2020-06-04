package p1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import p1.CheckPrime;

public class Test1 {
	   private CheckPrime app;
	    
	    @Before
	    public void setup() {
	        app = new CheckPrime();
	    }
	    
	    
	    @Test
	    public void test1() {
	        int count = app.checkPrime(2);
	        assertTrue(count == 1);
	    }

	    @Test
	    public void test2() {
	        int count = app.checkPrime(20);
	        assertTrue(count == 0);
	    }

	    @Test
	    public void test3() {
	        int count = app.checkPrime(31);
	        assertTrue(count == 1);
	    }

	    @Test
	    public void test4() {
	        int count = app.checkPrime(100);
	        assertTrue(count == 0);
	    }

	    @Test
	    public void test5() {
	        int count = app.checkPrime(7);
	        assertTrue(count == 1);
	    }
}
