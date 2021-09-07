import java.util.Scanner;
class Main{
    public static void main (String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting range:");              //Gets the starting range
        int n1 = sc.nextInt();
        System.out.print("Ending range:");                //Gets the ending range
        int n2 = sc.nextInt();
        System.out.println();
        if(n1>=n2||n1<1||n2<1)                            //Checks for the following conditions: 1.if starting range is greater than or equal to ending range, 2.if starting range or ennding range is less than 0.
            System.out.println("Provide valid input");  
        else{
            for(int i=n1;i<=n2;i++){                      //initial loop to assign value to a variable
                for(int j=2;j<i;j++){                     //loop to assign a divisible value to a variable
                if(i%j==0)                                //checks if the current number is prime or not
                    count++;                              //for every prime number found the value of count is incremented
            }
            if(count==0){
                if(i!=1)
                    System.out.println(i+" ");            //Prints the prime numbers.
            }
            count=0;
        }
        }
    }
}