import java.util.Scanner;

public class Esercizio1 {

    public static Boolean  stringaPariDispari (String str) {
 if (str.length() %2 == 0){
     return true;
 } else {

        return false;
 }
 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Inserisci una stringa di testo");
        String str = scanner.nextLine();

       boolean risultato = stringaPariDispari(str);
        System.out.println( "il numero di caratteri è pari? " + risultato);

    }
}
