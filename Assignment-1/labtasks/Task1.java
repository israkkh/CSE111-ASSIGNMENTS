import java.util.Scanner;
public class Task1 {
    public static void main(String args[]){
        int max = -99999 ;
        int min = 99999 ; 
        int sum = 0 ;
        int average = 0 ;
        Boolean flag = false ; 
        Scanner n = new Scanner(System.in);
        for(int i=0 ; i <10 ; i++ ){
           int num = n.nextInt();
           if(num % 2 != 0 && num > 0){
                flag = true ;
                sum += num ;
                if(num > max ){
                    max = num ;
                }
                if(num < min){
                    min = num ;
                }

            
           }
           System.out.println("sum" + sum );
           System.out.println("minimum" + min );
           System.out.println("maximum" + max);
           System.out.println("average" + sum/10);
           if(flag = false){
            System.out.println("no positive odd numbers");

           }

        }
        
    }
}
