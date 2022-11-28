import java.awt.*;

public class RefTester2 {
    public static void main(String[] args) {
        Point pt1, pt2;
        pt1 = new Point(100, 100);
        pt2 = pt1;  // to znaczy, ze od linii nr 8 zmienna referencyjna pt2 wskazuje dokładnie na to samo co zmienna pt1
                    // mamy tylko jeden obiekt, ale mamy dwie referencje do tego samego obiektu

        pt1.x = 200; // używając referencji pt1 zmienie wartość x na 200
        pt1.y = 200; // używając referencji pt2 zmienei wartość y na 200
        System.out.println(pt1);
        System.out.println(pt2); // okazuje się, że pt2 ma też te same wartości co pt1, bo one się
        // tylko odnoszą do jednego miejsca, które zostało zmienione


    }
}
