import java.util.Scanner;

public class Esercizio1 {

    public static Boolean  stringaPariDispari (String str) {
 if (str.length() %2 == 0){
     return true;
 } else {

        return false;
 }
 }
 public static Boolean  annoBisestile (int anno) {
 if  (anno % 4 ==0 || (anno % 100 == 0) && (anno  % 400 == 0 )) {
     return true;

 } else {
     return false;
 }
 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println( "Inserisci una stringa di testo");
        String str = scanner.nextLine();

       boolean risultato = stringaPariDispari(str);
        System.out.println( "il numero di caratteri è pari? " + risultato); */

        System.out.println( "Inserisci l'anno" );
        int anno = Integer.parseInt(scanner.nextLine());    boolean risultato = annoBisestile(anno);
        System.out.println( "L'anno è bisesto? " + risultato);

    }
}
