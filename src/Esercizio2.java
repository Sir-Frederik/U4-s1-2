import java.util.Scanner;

public class Esercizio2 {

public static void stampatore (int num) {
    switch (num){
        case 0 -> System.out.println("zero");
        case 1 -> System.out.println("uno");
        case 2 -> System.out.println("due");
        case 3 -> System.out.println("tre");
        default ->  System.out.println("Mi hai ingannato: questo Numero non rientra nel range ");


    }

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao, spara un num tra 0 e 3");
        int num = Integer.parseInt(scanner.nextLine());
        stampatore(num);
    }
}
