import java.util.StringTokenizer;

public class L6BirthDayToken1 {
    public static void main(String[] args) {

        String birtDay = "29/04/2016";

        StringTokenizer dataToken = new StringTokenizer(birtDay, "/");

        System.out.println("Dzień: " + dataToken.nextToken());
        System.out.println("Miesiąc: " + dataToken.nextToken());
        System.out.println("Rok: " + dataToken.nextToken());

        System.out.println("-----------------------------------");

        // inne podejcie do tematu bez Stringotenizer
        String day = birtDay.substring(0,2);
        String month = birtDay.substring(3,5);
        String year = birtDay.substring(6,10);

        System.out.println("Urodziny: " + birtDay);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);

        System.out.println("------------------");

        // inne podejście do tematu z użyciem klasy Stringtokenizer
        StringTokenizer st = new StringTokenizer(birtDay, "/");

        System.out.println("\n\nUrodziny: " + birtDay);
        System.out.println("Dzień: " + st.nextToken());
        System.out.println("Miesiąc: " + st.nextToken());
        System.out.println("Rok: " + st.nextToken());


    }
}
