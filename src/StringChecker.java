public class StringChecker { // jak zmienić nazwę klasy w przypadku pomyłki? za pomocą ShiftF6 przy zaznaczonej nazwie lub klikając prawym przyskiem na nazwie
                            // i w menu wybrać Refactor i następnie Rename.
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi"; // chcemy okreslić długość tekstu
        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu: " + str.length()); // w tym przypadku w notacji kropkowej moge sobie poszukać metody do policzenia ilości znaków
        System.out.println("Znak na pozycji 6: " + str.charAt(6)); // Szukam znaku na pozycji 6 - ale liczy od 0 czyli jest to de facto 5
        System.out.println("Fragment tekstu od znaku 10 do znaku 16 " + str.substring(10,16));
        System.out.println("Zwrócenie indeksy pierwszej wystepującej litery 't' " + str.indexOf('t'));
        System.out.println("jaki jest indeks początku podtekstu \"długi\":" + str.indexOf("długi"));
        System.out.println("Tekst zapisany wielkimi literami: " + str.toUpperCase());

    }
}
