import java.util.Scanner;

public class det {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Numri i pare");
        int numri1 = input.nextInt();
        System.out.println("Numri i dyte");
        int numri2 = input.nextInt();

        if (numri1 > numri2) {
            System.out.println("numri " + numri1+" esht ma i madh se numri " + numri2);
        } else if(numri1 < numri2) {
            System.out.println("numri " + numri1+" esht ma i vogel se numri " + numri2);
        }


    }
}

