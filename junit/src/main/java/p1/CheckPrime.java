package p1;

public class CheckPrime {
	public CheckPrime() {
		
	}
		 public int checkPrime(int n) {
		       // Corner case 
		        if (n <= 1) return 0; 
		      
		        // Check from 2 to n-1 
		        for (int i = 2; i < n; i++) 
		            if (n % i == 0) 
		                return 0; 
		      
		        return 1; 
		    }
}
