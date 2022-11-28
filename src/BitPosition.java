public class BitPosition {
    public static void main(String[] args) {
        int i = 234235; // liczba, która sprawdzamy
        int n = 7; // pozycja bitu, na którym ja sprawdzamy
        // jak to zrobić? mnożyc bitowo przez ampersand &
        // 5 & (1 << (n-1));
        int mask = 1 << n-1;
        boolean result = (i & mask) > 0;

        System.out.println("Dla liczby " + i + " na pozycji " + n + " znajduje sie bit: " + result);

        System.out.println();
        System.out.println();

        System.out.println(String.format("%32s", Integer.toBinaryString(i)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println("----------");
        System.out.println(String.format("%32s", Integer.toBinaryString(i & mask)).replace(' ', '0'));






    }
}
