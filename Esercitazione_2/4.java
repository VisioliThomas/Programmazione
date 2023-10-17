import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stringa numerica ( esattamente di 4 numeri ):");
        String stringa = scan.nextLine();
        if(stringa.length()!=4){
            System.out.println("Stringa non lunga abbastanza");
            System.exit(4);
        }
        // mancanza di cicli, quindi si fa uno per uno
        boolean giusta = false;
        if(stringa.charAt(0) > 47 & stringa.charAt(0) < 58)
            if(stringa.charAt(1) > 47 & stringa.charAt(0) < 58)
                if(stringa.charAt(2) > 47 & stringa.charAt(0) < 58)
                    if(stringa.charAt(3) > 47 & stringa.charAt(0) < 58){
                        // supponendo che la stringa va trasformata in int, sottraggo ad ogni carattere 48 ( trasformazione da numero ascii a numero ) e lo moltiplico per la sua posizione
                        int numeroDaStringa = (stringa.charAt(0)-48)*1000 + (stringa.charAt(1)-48)*100 + (stringa.charAt(2)-48)*10 + (stringa.charAt(3)-48);
                        System.out.println(numeroDaStringa);
                    }else
                        System.out.println("La stringa non è interamente numerica");
    }
}
