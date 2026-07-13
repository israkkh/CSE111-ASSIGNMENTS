import java.util.Scanner;

public class Task1 {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num1 = n.nextInt();
        System.out.println("Please enter a number : ");
        int num2 = n.nextInt();

        int countprime = 0 ; 

        for(int i=num1 ; i < num2 ; i++ ){
            // must be greater than 1
            if(i>1){
                boolean prime = true ;
                 for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
            }
           if(prime){
            countprime = countprime + 1 ;
           }
           
           
           }

        }
 
      System.out.println("Total prime numbers: " + countprime);
    
    }
}

