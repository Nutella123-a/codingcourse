import java.util.Scanner;

public class re {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("count up to: ");
        int numri = input.nextInt();
        int count = 0;

        while(count <= numri){
            System.out.println(count);
            count++;
        }
        System.out.println("count from: ");
        int numri1 = input.nextInt();
        int count1= 0;

        while(count1 <= numri1){
            System.out.println(numri1);
            numri1--;

        }



    }
}
