public class Operatory {
    public static void main(String[] args) {
        boolean mniejszy;
        int age = 37;
        mniejszy = age < 25;
        System.out.println(mniejszy); // to jest po prostu przyrównanie wartości mniejszej do większej ze znakiem większości więc wychodzi false


        // inkrementacja przedrostkowa i przyrostkowa
        int x, y, z;
        x = 42;
        System.out.println("x = " + x); // x = 42
        y = x++;
        System.out.println("y = " + y); // y = 42 ale x = 43
        System.out.println("x = " + x); // dowód, że x = 43
        z = ++x;
        System.out.println("x = " + x); // x = 44
        System.out.println("z = " + z); // z = 44


        // złożone operatory przypisania
        // x+=y to jest x=x+y
        // && AND iloczyn logiczny
        // || OR suma logiczna
        // != XOR alternatywa rozłączna
        // ~ negacja

        // Operatory bitowe
        // & AND iloczyn bitowy
        // | OR suma bitowa
        // ^ XOR bitowa różnica symetryczna
        // ~ negacja
        // << przesunięcie bitowe w lewo
        // >> przesunięcie bitowe w prawo
        // + operator konkatenacji
        // += rozszerzony operator konkatenacji
        // ?: operator if-else, wyrażenie logiczne true - false to się czyta następująco:
        // x > 5 ? y = 0 : y = 1
        // jeżeli x jest > od 5 to pod y podstaw 0 a jeżeli nei jest większe od 5 to pod y podstaw 1


    }
}
