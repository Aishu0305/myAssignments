package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 4;
		boolean temp = true;
		
    for (int i = 2; i < val; i++) {
    	
    		if(val%i==0)
    		{
    		    temp = false;
    			break;
    		}
    		
	}
    if(temp) {
    	System.out.println(val+" is prime number");
    	}
    	else{
    		System.out.println(val+ " is not prime number");
    
    	
    }
	}

}
