package lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        // Cele mai populare liste utilizate in multiple exercitii sunt cele de tipul ArrayList, ele fac partea din categoria List din familia Collection
        // Tot ce face parte din familia Collection se numeste STRUCTURI DE DATE
        // Acestea accepta ca si tipuri de date doar CLASE DE TIPUL OBIECT
        // Clase obiect care pot fi fie de tipul Wrapper (Integer, Long, Float, Double, Character)
            // peste tipuri de date primitive (int, long, float, double, char)
        List<Double> floatingNumbers = new ArrayList<>();
        floatingNumbers.add(78.2);      // indexul de ordine 0
        floatingNumbers.add(1.2);       // indexul de ordine 1
        floatingNumbers.add(-99.2);     // indexul de ordine 2

        for(int i = 0; i < floatingNumbers.size(); i++) {
            System.out.println(floatingNumbers.get(i));
        }
        System.out.println("------------------------------");

        List<Button> buttonList = new ArrayList<>();
        buttonList.add(new Button("rosu", 100));
        buttonList.add(new Button(23));
        buttonList.add(new Button("albastru"));
        buttonList.add(new Button("verde", 1));

        for(int i = 0; i < buttonList.size(); i++) {
            buttonList.get(i).displayAttributes();
        }
    }
}
