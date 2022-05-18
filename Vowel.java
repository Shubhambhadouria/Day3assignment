
public class Vowel {
	
	
	public static void main(String[] args) {	
		
	char ch = 'r';	
		
	int asciivalue = ch;
	
	if((asciivalue>=65 && asciivalue<=90) || (asciivalue >=97 && asciivalue <=122)) {
		
		if(ch=='A'|| ch=='E' || ch=='I' || ch=='O'|| ch=='U'|| ch =='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		
	}
	else
	{
		System.out.println("Error");
	}
		

	}

}