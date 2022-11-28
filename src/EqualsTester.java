public class EqualsTester { // porównywanie
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Ale to się rozrasta";
        str2 = str1; // druga zmienna str2 od tego momentu wskazuje na to samo, na co wskazuje zmienna nr 1,

        System.out.println("String 1 " + str1);
        System.out.println("String 2 " + str2);

        // Ponieważ obie zmienne wskazują na ten sam obiekt to jest pytanie czy to jest ten sam obiekt?
        System.out.println("Ten sam obiekt? " + (str1 == str2)); // to pokazuje, ze tak, to jest ten sam obiekt

        System.out.println("------------");

        // ale, jak zrobię tak, że do zmiennej string 2 przypisze nowy string - czyli stworze nowy obiekt
        // to się okaże że nie jest to ten sam obiekt. Dlaczego? Bo operator new alokuje pamięć i za kazdym razem
        // kiedy przypisujemy string to mechanizmy optymalizacyjne javy sprawdzaja czy jest już taki napis i
        // wykorzystują go ale gdy jest jawna deklaracja new string to jawnie chcemy, żeby powstało nowy napis
        // i wówczas jest to nowy i rózny
        str2 = new String(str1);
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));

        // natomiast jak sprawdzić, czy to jest ten sam napis? - do tego jest metoda equals
        System.out.println("Ta sama wartość? " + (str1.equals(str2)));
        // Wniosek z tego jest taki, ze jak porównujemy napisy - Stringi to nigdy nie używamy podwójnego ==
        // bo wtedy nie porónuje wartości tylko porównuje obiekty - to znaczy zaalokowane miejsca w pamieci
        // natomaist gdy używamy equals to wówczas porównuje stringi - czy to jest ta sama wartość stringu
        // To samo gdy porónujemy dwa Integery z wielkiej litery (liczby obiektowe) moga się pojawić problemy




    }
}
