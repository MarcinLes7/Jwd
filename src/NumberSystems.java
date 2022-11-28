public class NumberSystems {
    public static void main(String[] args) {

        // system dziesiętny 0,1,2,3,4,5,6,7,8,9
        // 154 -> 1*10^2 + 5*10^1 + 4*10^0 = 100 + 50 + 4 = 154

        // system dwójkowy - binarny 0,1
        // 101 -> 1*2^2 + 0*2^1 + 1*2^0 = 4 + 0 + 1 = 5

        // system ósemkowy - oktalny 0,1,2,3,4,5,6,7
        // 47 -> 4*8^1 + 7*8^0 = 32 + 7 = 39

        // system szesnastkowy - heksadecymalny - 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
        // 3af -> 3*16^2 + a*16^1 + f*16^0 = 3*16^2 + 10*16^1 + 16*16^0 = 768 + 160 + 15 = 943

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toOctalString(39));
        System.out.println(Integer.toHexString(943));

        // Jak to jest z tymi wartościami binarnymi
        // 8 4 2 1 -> przez tyle mnożemy każda poniższą liczbe binarną
        // 1 0 1 1 = 8*1 + 4*0 + 2*1 + 1*1 = 8 + 0 + 2 + 1 = 11

        // Operatory bitowe

        // & iloczyn bitowy
        // | suma bitowa
        // ^ XOR exlusive or
        // << >> operator przesunięcia bitowego w lewo i w prawo
        System.out.println("-----------------");

        int a = 1; // 0 0 0 1
        int b = 5; // 0 1 0 1
        // ------------------- * mnożenie bitowe
        //            0 0 0 1
        System.out.println(a & b);
        System.out.println("------------------------");

        System.out.printf("%10s\n", Integer.toBinaryString(a));
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.println("-----------------------");
        System.out.printf("%10s", Integer.toBinaryString(a & b));
        System.out.println();
        System.out.println();


        // Jeszcze inaczej, żeby się ładnie uporządkowało i miało zera przed
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("--------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0'));


        // A jak wygląda suma bitowa?
        int aa = 1; // 0 0 0 1
        int bb = 5; // 0 1 0 1
        // ------------------- + suma bitowa
        //            0 1 0 1
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("--------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ', '0'));

        // jak działa XOR
        // jak mamy 1 i 1 to dostajemy 0 - wówczas gry bity są równe np 1 i 1 lub 0 i 0
        // ale gdy bity są różne wówczas dostajemy 1
        int aaa = 1; // 0 0 0 1
        int bbb = 5; // 0 1 0 1
        // ------------------- + suma bitowa
        //            0 1 0 0
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("--------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));

        // przesunięcie bitowe w prawo
        System.out.println(b >> 2); // przesuwam piątkę bitowo w prawo o dwa miejsca, wówczas z liczby 0101
        // to otrzymam 0001

        // przesunięcie bitowe w lewo
        System.out.println(b << 2); // 0101 -> 010100

        // reprezentacja liczb ujemnych
        // w poniższym widzimy liczbę 1 w systemie binarnym, najmniej znaczący bit jest ustawiony na 1 a najbardziej znaczący na 0
        System.out.println(String.format("%32s", Integer.toBinaryString(1)).replace(' ', '0'));
        // natomiast całkiem inaczej wygląda reperzentacja liczby -1
        System.out.println(String.format("%32s", Integer.toBinaryString(-1).replace(' ', '0')));
        // jak wygląda transformacja liczby 1 na -1?
        // 0 0 0 1
        // 1 1 1 0 +1
        // -------- powyższe to przeliczenie: najpierw odwracamy  i na końcu dodajemy 1

        // kolejność wykonywania działań jak w matematyce


    }
}
