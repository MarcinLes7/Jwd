public class RightsRes {
    public static void main(String[] args) {
        char c = 169; // kod znaku z tablicy ASCII
        String s = " ";
        System.out.println(s + s + s + c);
        System.out.println(s + s + c + s + c);
        System.out.println(s + c + s + s + s + c);
        System.out.println(c + s + c + s +  c + s + c);



        // uwaga: jeżeli nie damy char tylko int to nie wyjdzie
        // uwaga: inna metoda rozwiązania tego zadania

        String space = " ";


        String row1 = space + space + space + c; // żeby to działało trzeba zrobić konkatenację bo nie da się połączyć char z String
        String row2 = space + space + c + space + c;
        String row3 = space + c + space + space + space + c;
        String row4 = c + space + c + space + c + space + c;

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);




    }

}
