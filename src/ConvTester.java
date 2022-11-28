public class ConvTester {
    public static void main(String[] args) {
        int firstPrice = 234; // zamianst int mogę wprowadzić Integer (obiektowy) i zadziała bo bedzie unboxing czyli niejawną konwersję i tak samo z innymi
        int secondPrice = 178;

        System.out.println(Math.max(firstPrice, secondPrice));

        // i jeszcze inne przykłady na konwersję niejawną
        byte a = 7; // byte jest najmniejszy
        short b;    // short jest wiekszy
        int c;      // int jest jeszcze większy 0 mniejsze moznba wkładac do większych - konwersja niejawna
                    // ale gdy chcemy włożyć większe do mniejszego to jest problem - podkreśla - bo możemy utracić dane
                    // wówczas trzeba zastosowawać konwerję jawną jeżeli dalej upeiramy się, żeby włożyć większe do mnienszego

        c = a;  // do c wkładamy a i jest ok - konwersja niejawna
        b = a; // podobnie jak wcześniej konwersja niejawna
        c = b; // mieści się w c b i jest ok,

        // b = c; // tu wyskakuje błąd do b sjort wkładamy do niego c int, który jest większy
               // i to trzeba skonwertować jawnie jeżeli naprawdę tak  chcemy
        // konwersję jawna sie robi tak
        b = (byte)a;

        // i kilka przykładówe z dzieleniem
        // ponizej jest konwersja niejawna - 5 zostało zamienione z inta do doubla i jest ok
        int aa = 5;
        double bb = 13.5; // w tym przypadku dzielimu doubla przez inta i dostajemy doubla którego wkładamy do doubla i jest kjonwerjsa niejawka
        double cc = bb / aa;

        // ale
        // int dd = bb / aa; // tak się nie da zrobić niejawnie bo doubla bysmy zamieniali w inta i byłaby strata danych, co mozna zrobić?
        int dd = ((int)bb) / aa; // wówczas mamy wszystko w incie ale wynik jest niedokładny,















    }
}
