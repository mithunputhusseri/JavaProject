package p1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Test3 {
	   private CheckPalindrome app;
	    
	    @Before
	    public void setup() {
	        app = new CheckPalindrome();
	    }
	    
	   
	    @Test
	    public void test1() {
	        int count = app.isPalindrome(151);
	        assertTrue(count == 1);
	    }

	    @Test
	    public void test2() {
	        int count = app.isPalindrome(1634);
	        assertTrue(count == 0);
	    }

	    @Test
	    public void test3() {
	        int count = app.isPalindrome(3113);
	        assertTrue(count == 1);
	    }

	    @Test
	    public void test4() {
	        int count = app.isPalindrome(1001);
	        assertTrue(count == 1);
	    }

	    @Test
	    public void test5() {
	        int count = app.isPalindrome(78);
	        assertTrue(count == 0);
	    }
}
