import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int sumelement = 0;
        int N = n.nextInt();
        double[] myarray1 = new double[N];
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            double input = n.nextDouble();
            myarray1[i] = input;
        }
        double[] newarray = new double[N];
        int newIndex = 0;
        for (int i = 0; i < myarray1.length - 1; i++) {
            if (myarray1[i] != myarray1[i + 1]) {
                newarray[newIndex] = myarray1[i];
                newIndex++;
            } else {
                sumelement++;

            }

        }
        newarray[newIndex] = myarray1[myarray1.length - 1];
        newIndex++;
        System.out.print("New Array : ");
        for (int i = 0; i < newIndex; i++) {
            
            System.out.print(newarray[i] + " " );

        }
        System.out.print("Removed elements : " + sumelement);

    }
}
