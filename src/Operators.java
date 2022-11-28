public class Operators {
    public static void main(String[] args) {
        int x = 5;
        x = x + 2;
        int y = 4;
        System.out.println(x + y);
        System.out.println(x / y); // x i y to integer i wynik to integer ale wówczas nie wyświetla po przecinku
                                    // trzeba o tym pamiętać: typ wyniku całkowity bo typ operandów calkowiety
        // trzeba zamienić jeden z tych typów na zmiennoprzecinkowy
        System.out.println(x / (double)y); // tu jest operacja rzutowania y na double
        // tak samo jest, jeżeli podstawiamy liczby, wówczas wystarczy dodać kropkę po liczbie
        System.out.println(3 / 2); // tu wynik to 1
        System.out.println(3 / 2.); // tu wynik to 1.5

        // wynik modulo
        System.out.println(5 % 2); // pokazuje tylko resztę czyli to co zostało z całosci
        System.out.println(5 / 2.);

        // operatory jednoargumentowe
        int a = 5;

    }
}
