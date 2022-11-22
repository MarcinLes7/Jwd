public class Employees {
    // na poczatku definiujemy zmienne
    String firstName;
    String lastName;
    byte age;
    char gender;
    int personalIDNumber;

    // okreslamy metodę na nowego pracownika
    public void newEmployee() { // tu nie może być static, bo nie pokazuje się w notacji kropkowej
        System.out.println("Imię: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Płeć: " + gender);
        System.out.println("Numer ID: " + personalIDNumber);
    }

    // określamy metodę main
    public static void main(String[] args) {
        // definiujemy nowego pracownika
        Employees marcin = new Employees();
        // inicjujemy parametry dio zmiennych
        marcin.firstName = "Marcin";
        marcin.lastName = "Leśniak";
        marcin.age = 50;
        marcin.gender = 'm';
        marcin.personalIDNumber = 1252325;
        // inicjujemy metodę
        marcin.newEmployee();
    }


}
