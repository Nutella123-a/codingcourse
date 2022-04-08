import java.util.Scanner;

public class WhileLoopsRrogat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tatimi1 = 0.05;
        double tatimi2 = 0.10;
        double tatimi3 = 0.15;

        System.out.println("Shkruaj rrogen brutto (-1 perfundon programin): ");
        double rroga = input.nextDouble();

        while (rroga != -1) {

            if (rroga >= 1 && rroga <= 180) {
                System.out.println("nuk ka tatim");
            }
            else if (rroga > 180 && rroga <= 250) {
                rroga = rroga - rroga * tatimi1;
                System.out.println("Rroga netto eshte: " + rroga);
            }
            else if (rroga > 250 && rroga <= 800) {
                rroga = rroga - rroga * tatimi2;
                System.out.println("Rroga netto eshte: " + rroga);
            }
            else if (rroga >= 800) {
                rroga = rroga - rroga * tatimi3;
                System.out.println("Rroga netto eshte: " + rroga);
            }
            System.out.print("Shkruaj rrogen brutto amar(-1 perfundon programin): ");
            rroga = input.nextDouble();
        }
        System.out.println("THE END00");
    }
}

