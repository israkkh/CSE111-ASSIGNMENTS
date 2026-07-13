import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int[] myarray1 = new int[N];
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            myarray1[i] = n.nextInt();

        }
        for (int i = 0; i < N; i++) {
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (myarray1[i] == myarray1[j]) {
                    count++;
                }
            }

            System.out.println(myarray1[i] + " appears " + count + " times");
        }


    }
}
