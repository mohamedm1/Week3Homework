import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		// Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Declare Variable
		
		int a = 0;
		int e = 0;
		int	i =	0;
		int o = 0;
		int u = 0;
		
		int vow = 0;
		// Check the Vowels
		System.out.print ("Enter any vowel");
		
    
    // Declare String 
    
		String vowel = sc.nextLine();
		
		for(int x = 0; x < vowel.length(); x++) {
			if(vowel.charAt(x)=='a') {
				a++;
			}
			else if(vowel.charAt(x)=='e') {
				e++;
			}
			else if(vowel.charAt(x)=='i') {
				i++;
			}
			else if(vowel.charAt(x)=='o') {
				o++;
			}
			else if(vowel.charAt(x)=='u') {
				u++;
			}
			else { 
				vow++;
			}
			
      
      // print out the Vowels and the count. 
      
			System.out.println("The vowel " + vowel + " has:");
			System.out.println(a + " lower case a'x");
			System.out.println(e + " lower case e'x");
			System.out.println(i + " lower case i'x");
			System.out.println(o + " lower case o'x");
			System.out.println(u + " lower case u'x");
			System.out.println(vow + " non vowels");
		
		
		
		}
		}
	

}




