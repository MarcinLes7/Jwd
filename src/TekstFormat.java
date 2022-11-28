import java.util.Locale;

public class TekstFormat {
    public static void main(String[] args) {
        int accountBalance = 15005;  // damy account balance, aczkolwiek wiemy, że zapisywanie takich wartości w int to się nie robi
                                    // chcemy to ładnie wyświetlić
        System.out.println(accountBalance); // to wyświeli normalnie
        System.out.printf("Saldo: %,d zł%n", accountBalance); // podajemy w tej funkcji szablon jak to chcemy zrobić - to jest szablon
                                                    // %,d chodzi o to, że po przeciku będzie wartość dziesiętna - d to decimal
                                                    // %n znak nowej linii
        // jakie są tu parametry?: po znaku % w [] podaje się wartości nieobowiązkowe
        // %[flags][width][.precision]conversion-character
        // s - strings formmatuj stringi
        // d - decimal integers
        // f - floating point numbers
        // t - formatowanie czasu i daty date/time
        // n - znak separacji linii
        // bB - boolean - wartości logiczne

        double pi = Math.PI;
        System.out.println(pi); // ta liczba pi jest dośc długa
        System.out.printf("%.11f%n", pi); // f konwersja na floating points, .11 po przecinku 11 znaków, %n znak nowej linii,
                                            // funkcja printf rozpoznała ustawienia regionalne i dała przecinek
                                // ale jak byśmy chcieli, żeby w printf były ustawienia amerykańskie to:
        System.out.printf(new Locale("us"),"%.11f%n", pi); // dajemy tu new locale i w nawiasie język



    }
}
