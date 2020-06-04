package p1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Test2 {
	   private CheckArmstrong app;
	    
	    @Before
	    public void setup() {
	        app = new CheckArmstrong();
	    }
	    
	   
	    @Test
	    public void test1() {
	        int count = app.isArmstrong(153);
	        assertTrue(count == 1);
	    }

	    @Test
	    public void test2() {
	        int count = app.isArmstrong(1634);
	        assertTrue(count == 1);
	    }

	    @Test
	    public void test3() {
	        int count = app.isArmstrong(31);
	        assertTrue(count == 0);
	    }

	    @Test
	    public void test4() {
	        int count = app.isArmstrong(100);
	        assertTrue(count == 0);
	    }

	    @Test
	    public void test5() {
	        int count = app.isArmstrong(7);
	        assertTrue(count == 1);
	    }
}
