package p1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Test4 {
	   private AddEmployee app;
	    
	    @Before
	    public void setup() {
	        app = new AddEmployee();
	    }
	    
	   
	    @Test
	    public void test1() {
	        app.addEmployee(8,"john","delhi");
	        String name = app.getEmployee(8);
	        System.out.println(name);
	        assertTrue(name=="john");
	    }

	    @Test
	    public void test2() {
	    	   app.addEmployee(9,"bobby","tvm");
		       String name = app.getEmployee(9);
		       assertTrue(name=="bobby");
	    }
}
