public class MarsRobot {   // to jest klasa w java, nazwałem ją marsRobot
    // poniżej ustawiam sobie pola - czyli zmienne
    String status;  // ustawiam sobie zmienną status typu String
    int speed; // przechowuję sobie tu dane o prędkości
    float temperature; // w tej zmiennej będziemy zapisywac temperaturę

    public void checkTemperature() {  // to jest nasza metoda do sprawdzania temperatury, metoda to coś takiego jak funkcją
        // a tu jest ciało funkcji - czyli zdefiniowane co się bedzie działo jak ją uruchomimy
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }

    public void showAttributes() { //kolejna metoda do pokazania wszystkich atrybutów
        System.out.println("Status: " + status);
        System.out.println("Predkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }

    public void checkStatus() { // kolejna metoda do sprawdzania statusu
        System.out.println("Bieżący status robota:");
        System.out.println(status);
    }


}
