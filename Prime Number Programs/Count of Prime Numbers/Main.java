//This program gives thenumber of prime numbers within range
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter starting range:");
		int low = sc.nextInt();
		System.out.print("Enter ending range:");
		int high = sc.nextInt();
		int check,count=0;
		for(int i=low;i<=high;i++){ 		//initial loop to assign value to a variable
		    check=0;
		    for(int j=1;j<=i;j++){			//loop to assign a divisible value to a variable
		        if(i%j==0)					//checks if the current number is prime or not
		            check++;				//for every non prime number found the value of check is incremented
		    }
		    if(check==2)
		        count++;					//for every prime number found the value of count is incremented
		}
		System.out.println(count);			// replace check instead of count to display non prime numbers in a range
	}

}
