import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la stringa di char minuscoli");
        String stringa = scan.nextLine();
        if(!stringa.equals(stringa.toLowerCase()))
            System.exit(-1);
        int i = 0, contvoc = 0, somma = 0;
        String copia = "";
        char c;
        while( i < stringa.length() ){
            somma += stringa.charAt(i);
            if( (stringa.charAt(i) < 97 || stringa.charAt(i) > 122) & stringa.charAt(i) != ' ')
                System.exit(-2);
            if( stringa.charAt(i) == 'a' || stringa.charAt(i) == 'e' || stringa.charAt(i) == 'i' || stringa.charAt(i) == 'o' || stringa.charAt(i) == 'u'){
                contvoc++;
                copia += stringa.charAt(i);
            }
            else{
                if(stringa.charAt(i) != ' ')
                    c = (char) (stringa.charAt(i) - 32);
                else
                    c = stringa.charAt(i);
                copia += c;
            }
            i++;
        }
        double media = somma / stringa.length();
        System.out.println("numero vocali: " + contvoc + "\nStringa con maiuscole: " + copia + "\nSomma Unicode: " + somma + "\nMedia: " + media);
    }
}
