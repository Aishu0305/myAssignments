package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int rang= 8;
      int val1=0;
      int val2=1;
      for( int i=0;i<rang-1;i++)
      { 
    	int val = val1+val2;
    	System.out.println(val);
    	val1= val2;
    	val2=val;
    	  
    	  
      }
	}

}
