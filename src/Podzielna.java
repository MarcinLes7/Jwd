public class Podzielna {
    public static void main(String[] args) {
        int liczba = 35;
        boolean check = (liczba % 7) == 0 && (liczba % 5) == 0;
        System.out.println("Czy liczba " + liczba + " dzieli się przez 7 i 5 jedniocześnie? - " + check);
    }
}
