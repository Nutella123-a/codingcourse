import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Numri Semaforit");
        int nrs = input.nextInt();
        if (nrs == 1){
            System.out.println("Semafori i kuq, NDALU!");
        }else if (nrs == 2){
            System.out.println("Semafori i verdhe, ngadalsohu");
        }else if (nrs == 3){
            System.out.println("Semafori i gjelbert, nisu");
        }else {
            System.out.println("Ska numer tjeter");
        }

        System.out.println("Mosha e studentit:");
        int mosha = input.nextInt();

        double cmimi = 100;
        double zbr1 = cmimi - 100 * 0.2;
        double zbr2 = cmimi - 100 * 0.05;
        double zbr3 = cmimi - 100 * 0.15;


        if (mosha > 14 && mosha < 19) {
            System.out.println("Studentet me moshen "+ mosha+" kan zbritje 20%, nga "+cmimi+ " euro ne "+zbr1+" euro");
        } else if (mosha > 19 && mosha < 26) {
            System.out.println("Studentet me moshen "+mosha+" kan zbritje 5%, nga " +cmimi+" euro ne " +zbr2+" euro");
        } else if (mosha > 50){
            System.out.println("Njerzt me moshen "+mosha+" kan zbritje 15%, nga "+cmimi+" euro ne"+" euro");
        } else {
            System.out.println("Nuk ka zbritje per ket mosh");
        }











    }
}
