import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao, dammi una stringa");
        String str = scanner.nextLine();
        while (str != ".q"){
            str.split("");
            System.out.println(str);
            break;
        }
    }
}
