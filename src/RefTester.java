public class RefTester {
    public static void main(String[] args) {
        String str1 = "jakiś tekst"; // chcemy sprawdzić co to jest za typ?
                // można to sprawdzić w prosty sposób
        System.out.println(str1.getClass().getName()); // można wywołac na tym obiekcie szereg metod notacją kropkową
        // uruchamiając metode getClass(), która daje z kolei możliwość uruchomienia metody getName()
        // a jak weźćmieny getSimpleName() to mamy nazwe bez rozszerzenia
        System.out.println(str1.getClass().getSimpleName());

        // jest też operator instanceOf
        System.out.println("Teksas"); // wyswietlam literał typel String i jednoczensie obiektem
        System.out.println("Teksas" instanceof String);
        // System.out.println("Teksas" instanceof Integer); // tak sie nie da
        System.out.println("Teksas" instanceof Object); // tak jest bo dziedziczą po Object

        Object obj = new Object();
        System.out.println(obj instanceof Object); // tak jest

    }
}
