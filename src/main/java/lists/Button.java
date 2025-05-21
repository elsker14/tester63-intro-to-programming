package lists;

public class Button {
    // Clasa de obiect = este o clasa ce reprezinta schita generala a unui obiect (fie el abstract sau fizic)
    // Clasa de obiect e definita de 3 tipuri de caracteristici:
        // - atribute : trasaturile obiectului de clasa, in general sunt inlantuite intr-o coloana la inceputul clasei
    String culoare;
    int dimensiune;

        // - constructori : sunt de 2 tipuri -> implicit (default), explicit (desfasurat)
    // Constructorul default: este mereu unul singur si are scopul de a initializa atributele cu o valoare generala, astfel incat sa nu fie nule
            // -- NU AVEM ARGUMENTE, acesta trateaza strict situatia in care atributele se initializeaza cu niste valori general valabile
            // -- are sens sa il utilizam atunci cand definim un obiect, DAR NU IL INITIALIZAM DIRECT CU UN CONSTRUCTOR DESFASURAT
            // -- mereu vom avea unul singur, unic
    public Button() {
        this.culoare = "";   // echivalentul lui 0, empty string
        this.dimensiune = 0;
    }

    // Constructor desfasurat:
            // Motivul pentru care putem avea o infinitate de combinatii de constructori desfasurati este fiindca putem sa utilizam atributele dupa cum dorim
            // sa arate constructoru, adica putem avea constructori cu un argument, doua argumente, trei argumente etc

            // Argumentele unui constructor sunt un mecanism de transfer al informatiei DINTR O ZONA DE MEMORIE IN ALTA, adica din clasa de rulare
            // in care e utilizata clasa de obiect ca tip de date in spatiu de memorie al acesteia

            // Denumirea argumentelor se poate face in 2 moduri, fie simbolic, avand aceeasi denumire ca atributul, fie diferit
            // Directionarea transferului de informatie in atributul corect se poate face cu POINTERUL this.
            // this este un keyword special in Java care se utilizeaza DOAR IN CAZUL UNEI CLASE DE OBIECT CU ATRIBUTE
    public Button(String culoare, int dimensiuneNoua) {
        this.culoare = culoare;
        this.dimensiune = dimensiuneNoua;
    }

    public Button(String culoare) {
        this.culoare = culoare;
    }

    public Button(int dimensiune) {
        this.dimensiune = dimensiune;
    }

        // - comportament: reprezinta o serie de metode/functii pe care obiectul sa le poata intreprinde
            // metodele sunt de 2 tipuri:
                // -- care returneaza un rezultat de un anumit tip de date
    public int getDimensiune() {
        // alt cod
        return this.dimensiune;         // TIPUL DE DATE AL METODEI COINCIDE CU TIPUL DE DATE AL REZULTULUI
    }
                // -- care produc un efect, de regula sunt utilizate pt afisari sau citiri sau sortari etc, si se numesc VOID
    public void displayAttributes() {
        System.out.println("Butonul este de culoare " + this.culoare + " si dimensiune " + this.dimensiune);
    }

}
