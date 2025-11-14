package week2.day3;

public class RemoveDuplicateWordInStringHomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="We learn java basics as part of java session in java week1";
		String lowerCase = text.toLowerCase();
		String[] splited = lowerCase.split(" ");
		String out="";
		boolean isRepeated=false;
		for (int i = 0; i < splited.length; i++) {
				
				if(out.contains(splited[i]))
				{
				   isRepeated=true;
				   
				 
				}else
				{
					out+=splited[i]+ " ";
					
					//System.out.println(out);
				}
				
				
				}
				
			System.out.println(out);
			
			
			
		}

	}


