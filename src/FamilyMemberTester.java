public class FamilyMemberTester {
    public static void main(String[] args) { // żeby uruchomic program potrzebujemy metody main i sprawdzimy członków naszej rodziny
        FamilyMember dad = new FamilyMember();    // tworzymy obiekt tata
        dad.name = "Karol";
        dad.age = 34;
//        dad.surname = "Kowalski";


        System.out.println("Nazwisko rodu to " + dad.surname); // tak nie powinniśmy robić
        System.out.println("Nazwisko rodu to " + FamilyMember.surname); // tak powinniśmy robić - czyli odwoływac się do klasy
                                        // a nie o obiektu
        // Co sie okazuje? żeby skorzystac z takiej zmiennej to wogóle nie ma potrzeby tworzenia obiektu
        // w czym jest różnica?
        FamilyMember mom = new FamilyMember();
        mom.name = "Dorota";
        mom.age = 30;
        mom.surname = "Kowalska";

        // zarówno dla Matki jak i Ojca nazwisko jest takie same ale inne parametry sa inne
        System.out.println("Nazwisko rodu mamy to " + mom.surname);
        System.out.println("Wiek mamy to " + mom.age);


        // I jeżeli zmienimy np nazwisko ojcu to sie okaże, że zmiana nastapiła u wszystkich członków rodziny ponieważ
        // informacja o nazwisku nie jest przechowywan jako dana danego obiektu (ojca) tylk ojest w jakims miejscu
        // w pamięci do którego odwołuja się wszyustkie obiekty



    }
}
