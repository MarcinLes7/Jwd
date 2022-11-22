public class Squares2 {
        int a;
        public void obliczenia() {
          System.out.println("Kwadrat o długości boku równej " + a + " .");
          System.out.println(" - obwód: " + (4 * a));
          System.out.println(" - pole powierzchni: " + (a * a));
          System.out.println(" - długość przekątnej: " + (a * Math.sqrt(2)));
          System.out.println();
              }

              public static void main(String[] args) {
                  Squares2 Kwadrat1 = new Squares2();
                  Kwadrat1.a = 2;
                  Kwadrat1.obliczenia();


                  Squares2 Kwadrat2 = new Squares2();
                  Kwadrat2.a = 7;
                  Kwadrat2.obliczenia();

                  Squares2 Kwadrat3 = new Squares2();
                  Kwadrat3.a = 12;
                  Kwadrat3.obliczenia();

                  }

              }




