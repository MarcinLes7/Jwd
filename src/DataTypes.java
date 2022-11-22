public class DataTypes {
    public static void main(String[] args) {
        // liczny całkowite
        // byte - zajmuje 1 bajt      00000000 - w nim jest 8 bitów
        // short - zajmuje 2 bajty    00000000 00000000 - w nim jest 16 bitów
        // int - zajmuje 4 bajty      00000000 00000000 00000000 00000000 - w nim jest 32 bity
        // long - zajmuje 8 bajtów    00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 - w nim jest 64 bity

        // domyślnie liczby całkowite traktowane są jako int i nie trzeba do nich dopisywać żadnych suffixów
        System.out.println(25658);

        // ale czasami trzeba zaznaczyć, że to nie jest int - gdy trzeba zapisac większa liczbę wychodzącą poza zakres int
        System.out.println(252125212542L); // tu ten integer jest za duży - trzeba dopisać L

        byte b = -120; // to pasuje dla byta bo jest od -128 do + 128, ale np -129 się nie da -
                        // to 120 jest automatycznie konwertowane na byta z inta
        short s = 31252;
        int i = 1_252_235_544;
        long l = i * b;
        System.out.println(l);
        long itemsNumber = 1222122552525555555l;
        char c = 43; // w tym przypadku 12 to jest kod dla jakiegoś znaku ASCII - bo to jest char
        System.out.println(c);

        // liczby zmiennoprzecinkowe
        // float - 4
        // double - 8 - on jest domuślnie używany dla liczb zmiennoprzecinkowych
        double a =  35.35;
        float f = 15.36f; // gdybyśmy tak chcieli zapisac to się nie da bo domyślnie jest double a chcemy wepchac float
                        // trzeba dopisac F
        double dd = 564654465465465465.54646546546546546; // jest bardzo pojemny ale niebezpieczny bo zaokrąglenia moga zafałszować wynik
                    // wówczas najlepiej pisać w incie korzystając z liczb całkoiwtych a poten przeliczać, np pisac w groszach a nie w zł.
        // typ znakowy
        System.out.println('a'); // możemy wyświetlić znak - tylko jeden znak w apostrofach i to sa różne znaki specjalne
        // czasami używamy znaki specjalne, np apostrof
        System.out.println('\''); // apostrof
        System.out.println('\"'); // cudzysłów
        System.out.println('\n'); // nowa linia
        System.out.println('\t'); // tabulator
        System.out.println('\b'); // ale co znaczy apostrof b?

        char malpa = 64;
        System.out.println(malpa);
        // jezeli chcemy wiedziec jaki ma kod znak małpy to trzeba wykonać rzutowanie czyli jawną konwersję
        System.out.println((int)malpa); // chce zamienić typ char na typ int, żeby dowiedzieć się jaki kod ma znak małpy




    }
}
