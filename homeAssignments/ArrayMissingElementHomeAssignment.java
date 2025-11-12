package week2.day2;

import java.util.Arrays;

public class ArrayMissingElementHomeAssignment {

	public static void main(String[] args)
	{
		int[] arr = {1, 2,4, 5, 6}; // Ascending order

    int n = arr.length + 1;  // total numbers should be 6
    int totalSum = n * (n + 1) / 2;  // Sum of first n natural numbers

    int arraySum = 0;
    int exp=0;
    for (int i=0; i <arr.length;i++) {
    int	tot=exp+arr[i];
     exp= tot;
    }

    int missingNumber = totalSum - exp;

    System.out.println("Missing number is: " + missingNumber);		
	
	
}
 


	}


