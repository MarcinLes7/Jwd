import java.util.StringTokenizer;

public class TokenTester3 {
    public static void main(String[] args) {
        // zadaniem jest analizaowanie cen akcji za pomocą tokenów tekstowych
        // jest taka specjalna klasa StringTokenizer

        StringTokenizer str1, str2; // deklaruję dwie zmienne str1 i str2

        // propgram pobiera dane ze źródeł z internetu z plików - są to zbitki tekstu

        String quote1 = "GOOG 530,80 -9,98"; // w zmiennej quote 1 pobieramy ze źródła nieczytelny ciąg znaków
                                            // to jest zakodowana informacja o canach akcji google
                                           // z tego ciągu znaków chcemy wyodrebnić szczeóły - rozdzielone sa przecinkami

        str1 = new StringTokenizer(quote1); // tworzymy nowy obiekt - deklarujemy, tu nie musimy okreslać parametru bo domyslnie to jest spacja
        System.out.println("Token 1: " + str1.nextToken());
        System.out.println("Token 2: " + str1.nextToken());
        System.out.println("Token 3: " + str1.nextToken());

        System.out.println("----------------------");

        String quote2 = "RTH@75,00@0,22"; // to rozdzielenia sa za pomoca znaku at czyli małpy
        str2 = new StringTokenizer(quote2, "@");
        System.out.println("Token 1: " + str2.nextToken());
        System.out.println("Token 2: " + str2.nextToken());
        System.out.println("Token 3: " + str2.nextToken());




    }
}
