import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);

        int sum = 0;

        String s1 = n.nextLine().toLowerCase();
        String revString = "";
        for (int i = s1.length() - 1 ; i >= 0; i--) {
            char c = s1.charAt(i) ;
            revString = revString + c ;
        }
    System.out.println(revString);    
    }
}
