package week2.day3;

public class ReverseOddPositionOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="I am a software tester";
String[] input= test.split(" ");
//System.out.println(input[3]);
for (int i = 0; i < input.length; i++) {
	if(i%2==0)
	{
		System.out.print(input[i]+ " ");
		
	}
	else {
		int a=input[i].length();
		char[] out=input[i].toCharArray();
		for (int j = a-1; j >=0; j--) {
			System.out.print(out[j]);
		}
		System.out.print(" ");
		
	}
}

	}

}
