public class Inwestycja {
    public static void main(String[] args) {
        int input = 14_000;
        double firstYear = input * 1.4;
        double secondYear = firstYear - 1_500;
        double thirdYear = secondYear * 1.2;

        System.out.println("Kwota inwestycji: " + input);
        System.out.println("Wartość inwestycji w pierwszym roku zwiększona o 40% = " + firstYear + " zł");
        System.out.println("Wartość inwestycji w drugim rokuze stratą 1500 zł = " + secondYear + " zł");
        System.out.println("Wartość inwestycji w trzecim roku powiększona o 12% = " + thirdYear + " zł");

        System.out.println("--------------------------------");

        // inny sposób pana prowadzącego
        float total = 14_000;
        System.out.println("Inwestyucja początkowa: " + total + " zł");

        total = total + (total * .4F);
        System.out.println("Po pierwszym roku : " + total + " zł");

        total = total - 1500F;
        System.out.println("Po drugim roku : " + total + " zł");

        total = total + (total * .12F);
        System.out.println("Po trzzecim roku : " + total + " zł");




    }
}
