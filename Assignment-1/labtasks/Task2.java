import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);

        int sum = 0;
        String s1 = n.nextLine();
        String s2 = n.nextLine();
        String concaString = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            concaString = concaString + c;
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                sum = sum + c ;
            }
            

        }
        concaString = concaString + " ";

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            concaString = concaString + c;
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                sum = sum + c ;
            }
             

        }
        System.out.println(concaString);
        System.out.println(sum);
    }
}
