import java.text.DecimalFormat;
import java.util.Locale;

public class Vars {

    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        int naszaLiczba = 1203453452;
        int innaLiczba = 8;
        int mnozenie = 5;

        System.out.println("Nasza liczba to " +  naszaLiczba);
        System.out.println("Liczba " + naszaLiczba + " jest o " + (naszaLiczba - innaLiczba) +  " większa od liczby " + innaLiczba);
        System.out.println("Jezeli pomnożymy naszą liczbę " + naszaLiczba + " przez " + mnozenie + " to otrzymamy wartość " + (naszaLiczba * mnozenie));

        String mainProtocol;  // deklaracja
        int localAreaCode = 34567; // inicjalizacja

        int a = 6; // typ podstawowy

        String[] streets = {"Florianska", "Batorego", "Wislna"};
        final double PI = 3.14;
        final int A;
        A = 4; // tę wartość przypisuje się tylko jeden raz

        final String NAME = "Jakaś nazwa"; // tej nazwy nie da się zastąpić niczym innym

        double x = 12e5; // to znaczy 12*10^5 = 1200000
        double y = 3E-3; // to znaczy 3*10^-3 = 0,003

        System.out.println(x);
        System.out.println(y);

        // dodatkowe oznaczenia literałów
        double z = 0.000000000000000000d;   // jednoznacznie determinujemy że to jest double
        System.out.printf("%.23f",z); // za pomocą tego możemy wymóc 23 miejsce prezentuj zmienną typu float z 23 miejscami po przecinku

        double b = 2.432E-17;
        System.out.println(b);
        System.out.printf("%.20f", b); // ale w tym przypadku przy wyświetleniu będzie pokazany przecinek a nie kropka, bo metoda printf sugeruje sie ustawieniami regionalnymi
        // a metoda println nie, trzeba wówczas napisac inaczej
        System.out.printf(new Locale("us"), "%.20f", b); // i wówczas printf napisze z kropką

        // jeszcze jest metoda decimalFormat
        DecimalFormat df = new DecimalFormat("#.#######################"); // tu sterujemy wyświetlami liczb - liczba i ile miejsc po przecinku znaczą te hasze
        System.out.println();
        System.out.println("\n" + df.format(b));

        // możemy zapisywac liczby w postaci binarnej a będą się wyświetlać w postaci dziesiętnej, dzięki zapisowi 0b a po nim zapis w postaci binarnej, np
        int val = 0b101;
        System.out.println(val);

        // podobnie w postaci ósemkowej dając 0 na początek
        int val1 = 0101;
        System.out.println(val1);

        // szesnastkowo poprzez zapodanie na początku 0x
        int val2 = 0xFF;
        System.out.println(val2);

        // zmienna boolean
        boolean chosen = true;
        char key = 'a'; // stosujemy pojedynczy apostrof

        String password = "hasło";
        String message = "raz \t\t dwa trzy"; // \t to jest tabulator
        System.out.println(message);

        String message1 = "Naucz się szydełkować \u2122"; // u2122 to znak zastrzeżony
        System.out.println(message1);




    }
}
