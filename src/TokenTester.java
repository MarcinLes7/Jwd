public class TokenTester {
    // program operuje na tokenach
    // metoda main jest statyczna, to znaczy, że nie trzeba tworzyć obiektu tokenTester, zeby wywołac metode main
    // dlatyego musi być sttyczna, żeby program się wogóle uruchomił
    public static void main(String[] args) {
        // każda klasa dziedziczy po klasie object (niejawwnie)

        Object obj; // deklarujemy, że w przyszłości będę używał takiej zmiennej tajkiego typu, zmienna będiz eprzechwowywała referencje do typu Object
        Object obj1 = new Object();  // Ale tutaj nie jest tylko sama deklaracja tylko jeszcze inicjalizacja objektu wartością - czyli tu jest definicja
          // operator new rezerwuje nam pamięć i uruchomieniem i zarezerwowaniem tego objektu Object

        String name =  new String("Michael Jordan"); // tworzymo sobie objet typu string który inicjalizujemy wartoscią Michal Jordan
              // po tym wiemy ze w obszarze pamięci konmputera powstaje taki objekt, do którego referencja przchowywana jest pod zmienna o nazwie name

        // Uwaga Uwaga - czasami nie ma potrzeby wpisywac "new String" tylko po prostu String name = "Michael Jordan", ale są różnice. W jednych przypadkach ma to znaczenie
        // ale w innych nie. I to będzie wyjasnione później
        // Inne przykłady
      //  Point pt = new Point(0, 0);




    }
}
