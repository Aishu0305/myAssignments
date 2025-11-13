package week2.day3;

import org.apache.http.util.CharArrayBuffer;

public class ChangeToUpperCaseOddIndexHomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="changeme";
char[] charArray = input.toCharArray();
int leng=charArray.length;
System.out.println("lenth of string"+leng);
for (int i = 0; i < charArray.length; i++) {
	if(i%2!=0)
		
	{
		char upperCase = Character.toUpperCase(charArray[i]);
		System.out.print(upperCase);
	}
	else {
		System.out.print(charArray[i]);
	}
	
}



	}

}
