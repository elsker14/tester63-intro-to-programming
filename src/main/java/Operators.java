import javax.swing.*;
import java.util.Scanner;

public class Operators {

    /*
        In Java putem avea o infinitate de clase, fiecare cu cate o functie de rulare MAIN.
        Singura restrictie este ca per clasa sa avem o singura functie.

        Codul in java in general e structurat pe clase, care sunt fisiere cu extensia ".java".
        Acest lucru inseamna ca avem optiunea sa ne clasificam clasele dupa diverse contexte specifice sub forma de folder.
        Terminologia corecta pt folder in programare este cea de PACHET (package).

        In programare pentru verificarea conditiilor logice se foloseste tipul de date boolean.
        Acest tip de date are doar doua valori posibile, true sau false.
        Putem asocia valorile de true/false cu valorile codului binar, true = 1, false = 0.

        CTRL + D = duplicate line

        Conversia implicita = reprezinta transformarea unei variabile dintr-un tip date in altul de aceeasi natura
        -> functioneaza doar daca ambele tipuri de date sunt fie logice, fie numerice, fie de tipul char

        Conversia explicita = reprezinta mecanismul conditional prin care se face conversia unei variabile folosind operatorii logici si instructiunile conditionale

        Pana acum am lucrat doar cu clase de rulare. Ce este o clasa de rulare? E o clasa care contine o metoda MAIN.
        In schimb exista multiple clasificari contextuale pentru utilizarea claselor.
        Unul dintre cele mai intalnite cazuri este cel al CLASEI DE OBIECT.
        O clasa de obiect este o schita generala a unui obiect/concept abstract care este definit de o serie de caracteristici (atribute),
        constructori si comportament (metode).
     */
    public static void main(String[] args) {
        boolean myFirstTrueVariable = true;
        boolean myFirstFalseVariable = false;
        System.out.println("Variabila mea de adevar este: " + myFirstTrueVariable);
        System.out.println("Variabila mea de fals este: " + myFirstFalseVariable);

        // boolean mySecondTrueVariable = 1;   // nu functioneaza fiindca initializarea se face intre doua tipuri de date diferite
        boolean mySecondTrueVariable;   // doar declaram variabila, iar initializarea o vom face dupa verificarea conditionala
        int numberToCheck = 1;
        // Sintaxa instructiunii conditionale if: if(operatie conditionala) { } else { }
        if(numberToCheck == 1) {
            // scenariu de adevar
            mySecondTrueVariable = true;
            System.out.println("A doua mea variabila booleana chiar este " + numberToCheck);
        } else {
            // scenariu de fals
            mySecondTrueVariable = false;
            System.out.println("A doua mea variabila booleana nu este " + numberToCheck);
        }
        System.out.println("A doua mea variabila de adevar este: " + mySecondTrueVariable);

        System.out.println("----------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        int bigValue = scanner.nextInt();

        System.out.println("Numarul introdus este: " + bigValue);
        /*
        System.out.println("Al doilea numar citit este: " + scanner.nextInt());
        System.out.print("Al treilea numar citit este: ");
        scanner.nextInt();
        */

        // If simplu cu un scenariu de adevar
        if(bigValue >= 100) {
            // scenariu de adevar
            System.out.println(bigValue + " este mai mare sau egal decat " + 100);
        }

        // If standard cu 2 scenarii de adevar
        if(!(bigValue >= 100)) {
            // scenariu de fals
            System.out.println(bigValue + " este mai mare sau egal cu 100, dar scenariul este fals");
        } else {
            // scenariu de adevar
            System.out.println(bigValue + " este mai mare sau egal cu 100, dar scenariul este adevarat");
        }

        // If infinit
        if(bigValue > 100) {
            System.out.println(bigValue + " este mai mare STRICT decat 100");
        } else if(bigValue <= 999) {
            System.out.println(bigValue + " este mai mic sau EGAL cu 999");
        } else {
            System.out.println(bigValue + " nu este intre 100 si 999");
        }

        // !! OPTIMIZEAZA CODUL PENTRU A RESPECTA PRINCIPIUL DE BOUNDARY TESTING
        if(bigValue > 100 && bigValue <= 999) {
            System.out.println(bigValue + " se afla in intervalul (100, 999]");
        } else {
            System.out.println(bigValue + " se afla in afara intervalului!");
        }

        System.out.println("----------------------------------------------------------");
        // If tertiar
        System.out.println(bigValue + ((bigValue > 100 && bigValue <= 999) ? " se afla in intervalul (100, 999]" : " se afla in afara intervalului!"));
        boolean parityChecker = (bigValue % 2 == 0) ? true : false;
        System.out.println(bigValue + " este un numar par? " + parityChecker);

        System.out.println("----------------------------------------------------------");
        // Switch
        int sizeNumber = 3; // Replace with your desired size (1, 2, 3, 4, or 5)

        switch (sizeNumber) {
            case 1:
                System.out.println("Extra Small");
                break;
            case 2:
                System.out.println("Small");
                break;
            case 3:
                System.out.println("Medium");
                break;
            case 4:
                System.out.println("Large");
                break;
            case 5:
                System.out.println("Extra Large");
                break;
            default:
                System.out.println("Invalid size number");
        }
    }
}
