import java.util.Scanner;

public class det2new {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 3;
        int korrekt2= 2;
        int korrekt3 = 4;
        int korrekt4 = 1;


        System.out.println("1. Cili isht kryeqyteti Japonis?(3pik)\n\t a. Tokyo \n\t b. Berlin \n\t c. Bejing");
        String answer1 = input.nextLine();

        if(answer1 .equals ("a")){
            System.out.println("Korrekt");
        }else if(answer1 .equals ("b")){
            System.out.println("Gabim");
        }else if(answer1 .equals ("c")){
            System.out.println("Gabim");
        }else{
            System.out.println("Nuk egziston kjo pergjigjje");
        }

        System.out.println("2. Ne Java ekzekutimi programit fillon ne metoden main (2 pike)\n\t a. True \n\t b. False");
        String answer2 = input.nextLine();

        if(answer2 .equals ("a")){
            System.out.println("korrekt");
        }else if(answer2 .equals ("b")){
            System.out.println("Gabim");
        }else{
            System.out.println("Nuk egziston kjo pergjigjje");
        }

        System.out.println("3. Armiku i Harry Potter eshte: (4 pike)\n\t a. Darth Vader \n\t b. Vladimir Putin \n\t c. Voldemort \n\t d. Vucic");
        String answer3 = input.nextLine();

        if(answer3 .equals ("c")){
            System.out.println("Korrekt");
        }else if(answer3 .equals ("a")){
            System.out.println("Gabim");
        }else if(answer3 .equals ("b")){
            System.out.println("Gabim");
        }else if(answer3 .equals ("d")){
            System.out.println("Gabim");
        }else{
            System.out.println("Nuk egziston kjo pergjigjje");
        }


    }
}
