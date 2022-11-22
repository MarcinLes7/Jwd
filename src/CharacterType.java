public class CharacterType {    // zakładamy nową klasę characterType
    public static void main(String[] args) {  // musi być metoda uruchomieniowa main
        showInfo('a'); // chcemy się dowiedzieć jaki kod ma litera a
        showInfo('b'); // jaki kod ma litera b
        showInfo('A'); // jaki kod ma litera A
        showInfo('ą'); // jaki kod ma ą
        // czyli w metodzie main wywołuję tę metodę cztery razy
        // ale sposób jak to ma działac jest opisany w metodzie showInfo

        showInfo2(); // ale tu musze odwołac się do tej drugiej metody

        showInfo3();

        showInfo4('A');

    }

    public static void showInfo(char c) {    // poniżej metody main tworzymy metodę, która będzie wyświetlała informację o poszczególnych znakach
                                        // to jest publiczna statyczna metoda nie zwracająca konkretnego typu o nazwie showInfo zapisywane z małej litery
                                        // w nawiasach okrągłych można wprowadzić parametr tej metody - typ i nawa argumenty
                                        // w metodzie będziemy podawać argumenty typu char
        System.out.println("Kod znaku '" + c + "' to: " + (int)c); // (int)c - to jest zrzutowanie liczby na ciąg znaków
                                        // czyli to jest nasza metoda czyli sposób na pokazanie czegoś a teraz w metodzie main musimy podać co chcemy przekładać
    // pytanie czy nie można tego zrobić trochę inaczej

    }

    public static void showInfo2() {    // czyli moge napisac metodę gdzie niekoniecznie w nawiasach musze wprowadzić parametry lecz poniżej
        char znak;
        znak = 64;
        System.out.println("Kod znaku '" + znak + "' to: " + (int)znak);

    }


    public static void showInfo3() {
        char znaki;
        znaki = 'A';
        System.out.println("Kod kolejnego znaku '" + znaki + "' to: " + (int)znaki);
    }

    public static void showInfo4(char znaczek) {   // czyli z tego wynika, że jeżeli chce wywoływac wielokrotnei metodę to musze w nawiasach okrągłych wpisac typ danych i nazwę
        System.out.println("Kod następnego znaku '" + znaczek + "' to: " + (int)znaczek);
    }




}
