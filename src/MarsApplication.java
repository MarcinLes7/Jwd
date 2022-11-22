public class MarsApplication {
    public static void main(String[] args) { // tworzę metodę bardzo ważną publiczną statyczna i nie zwracająca konkretnego typu i musi nazywac się main i byc ciągiem znaków String
        // w tej metodzie twozę pierwszy OBIEKT typu Mars Robot, a skąd się ten obiekt bierze? mam go z klasy MarsRobot, którą zdefiniowałem wczesniej
        MarsRobot spirit = new MarsRobot();
        spirit.status = "Eksploracja";     // odwołuję się w notacji kropkowej do parametrów tego roboto, które okresliłemw cześniejszej klasie
        spirit.speed = 2;
        spirit.temperature = -60;
        // wszystkie te statusy i speedy musza być zawarte w metodzie main  a cała metoda main musi być zawarta w klasie MarsApplication

        spirit.showAttributes();   // no i jeszcze na tym egzemplarzu robota mogę wywołac metodę showAttributes (notacją kropkową), wyświetli nam wszystkie atrybuty
        // dlaczego po uruchomieniu priogramu zostały wyświetlone parametry robotsa,m gdy przecież nei ma w tej metodzie println?
        // dlatego, że została wywołana metoda showAttributes, która ma takie printliny w sobie

        System.out.println("--------------------");

        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("--------------------");

        System.out.println("Zmiana temperatury do -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("--------------------");

        System.out.println("Sprawdzenie temperatury;");
        spirit.checkTemperature(); // przy sprawdzeniu temperatury mamy pętle, która gsy temperatura jest < -80 zmienia jego status i prędkość
        spirit.showAttributes();

        // cały nasz program składa się z dwóch plików: z klasy MarsApp;ication i z klasy MarsRobot
        // klasa MarsApplication korzysta z klasy MarsRobot wykorzystując klasę to wytworzenia konkretnego egzem[plarza
        // ten nasz egzemplarz ma nazwę spirit i na nim wykonujemy rózne zmiany np statusu lub temperatury czy predkości

        System.out.println("--------- Nowy Robot Opprotunity --------");
        // tworzymy nowy obiekt o nazwie opportunity
        MarsRobot opportunity = new MarsRobot();
        opportunity.speed = 20;
        opportunity.status = "w drodze na marsa";
        opportunity.temperature = -90;

        opportunity.showAttributes();
        opportunity.checkTemperature();
        opportunity.checkStatus();




    }
}
