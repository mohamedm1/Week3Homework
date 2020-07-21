import java.util.Scanner; 

public class EvenNumSum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n;
		
		System.out.print(" Enter a number");
		
		n = sc.nextInt();
		
		if(n<2)
		  {
		   System.out.println("ERROR: number is less than 2.");
		   System.out.print("Enter a number greater than 2: ");
		   n = sc.nextInt();
		  }
		
		int sum1 = 0;
		
        for(int i = 2; i <= n; i += 2) {
            sum1 += i;
        }
        System.out.println("Sum of all even numbers upto " + n + " is " + sum1);
    }

	}
