public class Loops {

    public static void main(String[] args) {
        // For -> este o instructiune repetitiva care ne permite sa executam un bloc de cod de un anumit numar de ori
        // Repetitiile unei instructiuni repetitive se numesc iteratii.
        // Iteratiile pentru a putea fi urmarite sunt clasificate dupa indecsi -> sunt numerotate.
        // Sintaxa -> for (expresie1; expresie2; expresie3) { // codul pe care il repetam }
        // expresia 1 -> in general este o instructiune de definire si initializare pentru indexul de urmarire a iteratiilor
            // Cel mai adesea expresia 1 va fi -> int i = 0;
            // Indecsii de urmarire in Java in general vor purta denumirea unei litere incepand cu i. (i, j, k, l ... )
            // MEREU indecsii vor fi numere intregi (FOARTE RAR veti folosi tipul de date char pentru definirea iteratiilor -> codul ASCII)
        // expresia 2 -> este o instructiune conditionala TERMINALA -> i <= 10
        // expresia 3 -> este o instructiune de avansare -> i = i + 1 (varianta lunga de sintaxa), i++ (varianta scurta)

        // For cu rata de crestere pozitiva de la min la max
        for(int i = 0; i <= 10; i++) {
            // pe tot parcursul rularii blocului repetitiv i este valoarea curenta
            // cod pe care sa il repetam de 11 ori (iteratiile pornesc de la 0 si se opresc la 10)
            System.out.println("Indexul este: " + i);
        }   // i creste abia dupa ce se executa blocul repetitiv
        System.out.println("----------------------------------------");

        // For cu rata de crestere negativa de la max la min
        for(int i = 5; i >= 0; i--) {
            System.out.println("Indexul invers este: " + i);
        }
        System.out.println("----------------------------------------");

        // Exemplu de post/pre incrementare/decrementare -> functioneaza DOAR pentru adunare (++) /scadere (--)
        int i = 3;
        int a = i++; // a = 3, i = 4 -> inseamna ca asignarea lui a se face cu VALOAREA CURENTA a lui i
        // dupa ce asignarea se finalizeaza, i creste
        System.out.println(a + " " + i);
        int b = ++a; // b = 4, a = 4 -> inseamna ca asignarea lui b se face cu VALOAREA DEJA INCREMENTAT a lui a
        System.out.println(a + " " + b);
    }
}
