package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int input = 121;
  int num =input;
  int revNum=0;
  while(num!=0)
  {
	  int digit = num%10;
	  revNum=revNum*10+digit;
	  num=num/10;
  }
  if(input==revNum)
  {
  System.out.println("no is palindrome");
   }
  else
  {
	  System.out.println("no is not palindrome");}
  }

}
