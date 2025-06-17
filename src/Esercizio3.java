import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str ="";
       do {
           System.out.println("Ciao, dammi una stringa");

         str = scanner.nextLine();
           str.split("");
           System.out.println(str);
           System.out.println(" Dammene un'altra ");
           str = scanner.nextLine();
           break;
       }

        while (!str.equals(":q") );


    }
}
