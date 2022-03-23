import java.util.Scanner;

public class det1new {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nurmi i pare");
        int nr1 = input.nextInt();
        System.out.println("Numri i dyt");
        int nr2 = input.nextInt();
        System.out.println("numri i tret");
        int nr3 = input.nextInt();

        if(nr1 > nr2 && nr1 > nr3){
            System.out.println("numri ma i madh isht "+nr1);
        }else if(nr2 > nr1 && nr2 > nr3){
            System.out.println("numri ma i madh isht "+nr2);
        }else if(nr3 > nr1 && nr3 > nr2){
            System.out.println("numri ma i madh isht "+nr3);
        }



    }
}
