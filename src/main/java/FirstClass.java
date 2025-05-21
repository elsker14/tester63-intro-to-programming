// aici nu trebuie sa existe cod (MOMENTAN)

public class FirstClass {

    /*
        Java = e un limbaj de programare orientat pe obiecte  care are scopul de a utiliza o serie de instructiuni
        prestabilite pentru a defini diversi algoritmi

        Tot codul pe care il vom scrie in Java, va fi definit in interiorul unor fisiere speciale cu extensia ".java" denumite CLASE.
        Cel mai simplu tip de clase sunt cele de tipul MAIN. O clasa de acest tip contine in interiorul acoladelor ei o functie numita "public static void main".
        Scopul unei astfel de functii este de a crea un executabil din codul nostru pentru a procesa informatia si a o prelucra dupa algoritmul definit.

        Ce este o metoda/functie?
            E o portiune de cod cu scop limitat.

        In general, metodele/functiile sunt pur si simplu portiuni de cod cu un scop definit algoritmului, insa METODA MAIN ESTE SINGURA METODE UTILIZATA PENTRU RULAREA UNUI PROGRAM.

        Exista o relatie de unaritate intre o clasa si o metoda main, adica intr-o clasa, putem avea o singura metoda de rulare main.

        Majoritatea instructiunilor in Java pe care le scriem sunt finalizate cu simbolul ";". Simbolul acesta il putem considera un delimitator de rulare.

        Prescurtari:
            1. sout = System.out.println()
            2. psvm = public static void main(String[] args) { }
            3. CTRL + ALT + L = format code
            4. CTRL + ALT + O = clean imports

        Java este un limbaj de programare puternic pe tipul de date al variabilelor. Acest lucru inseamna ca o variabila poate avea un singur tip de date.
        Sintaxa pentru definirea unei variabile de un anumit tip de date este: variable_type variable_name;

        Reguli de scriere:
            - clasele se scriu mereu cu majuscula si camel case -> de exemplu: FirstClass, ObjectInterceptor, DatabaseConfig etc..
            - variabilele/obiectele se scriu mereu cu litera mica si camel case in continuare: myNumber, errorMessage, etc..
            - constantele se scriu mereu cu majuscule, iar cuvintele se despart intre ele cu "_": SUMA_TOTALA, SELECTOR_PAGINA, ELEMENT_WEB_DINAMIC etc..

        Ce e o variabila? O variabila e o mica informatie singulara care stocheaza o valoare.
        Valorile pot avea diverse tipuri de date singulare:
            - numerice: numere intregi (int, long), numere fractionare (float, double)
            - caractere: caractere (char), propozitii sau texte (String)

        Tipurile de date sunt definite in general dupa un interval de limitare [-min, +max]. Acest interval totodata defineste si valoarea de memorie de care are nevoie
        o variabila/obiect pentru a stoca o informatie. Unitatea primordiala de stocare a informatiilor in memorie se numeste BYTE.

        Byte-ul nu e cea mai mica unitate de memorie, un byte = 4 biti
        10 in baza 2 - 0000 0101

        Declaratie vs Initializare?
            - declaratia presupune definirea unei variabile cu un anumit tip de date dar fara nicio valoare stocata
            - initiatilizarea presupune egalizarea unei variabile cu ceva de tipul de date specificat

        Diferenta majora intre float si double este capacitatea de stocare cu acuratete a zecimalelor. Float poate stoca pana la 7 zecimale, in timp ce double poate pana la 15.
        In Java tipul de date implicit (default) pentru numere fractionare este double, pentru a defini variabile float e nevoie de o conversie de tip intre cele 2,
        realizata prin adaugarea literei 'f' la finalul valorii.
    */
    public static void main(String[] args) {
        // Primul program in Java - afisarea mesajelor pe firul de transfer al datelor la consola (output)
        System.out.println("Hello World!");
        System.out.println("Hi again");
        System.out.println("-----------------------------------------");

        // Tipuri de date numerice -> variable_type variable_name;
        // Procesul de definire si initializare se poate face fie pe rand, exemplul cu numarul intreg, fie concomitent, exemplul cu numarul real.
        // varianta extinsa de definire si initializare
        int myFirstInteger; // la momentul actual, noi doar am REZERVAT un spatiu de memorie in care in viitor va fi salvata o valoare
        myFirstInteger = 58;
        System.out.println(myFirstInteger); // intotdeauna cand afisati rezultate la consola, fiti siguri ca acestea sunt nenule

        // varianta restransa de definire si initializare
        int otherNumber = 122;
        System.out.println(otherNumber);

        float myFirstFloatingNumber = 78.998212f;
        System.out.println(myFirstFloatingNumber);
        System.out.println("-----------------------------------------");

        // Operatii aritmetice matematice -> +, -, /, *
        // Varianta 1: Stocarea rezultatului unui calcul matematic intr-o variabila initializata deja
        long result1 = 0;       // definim variabila de rezultat ca fiind 0
        long nr1 = 67980;
        long nr2 = 2000;
        result1 = nr1 + nr2;    // reinitializare cu rezultatul sumei dintre nr1 si nr2
        System.out.println(result1);
        System.out.println("Rezultatul sumei este " + result1); // => in momentul care adaugam loguri pe afisari, rezultatul indiferent de natura lui se converteste la tipul de date String
        // procesul de mai sus se numeste CONCATENARE
    }

}

// aici nu trebuie sa existe cod (MOMENTAN)
