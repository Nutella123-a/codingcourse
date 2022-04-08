import java.util.Scanner;

public class WhileLoopsNotat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota = 0;
        double shuma = 0;
        double count = 0;



        while(nota != -1){
            System.out.println("Shkruaj noten(-1 perfundon programin):");
            nota = input.nextDouble();

            if(nota != -1) {
                shuma = nota + shuma;
                count++;

            }





        }
        System.out.println("Nota mesatare eshte " + shuma/count);
    }
}
