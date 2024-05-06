import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaFrutas {

    // Declaración del atributo de tipo List
    List<String> listaCadenas;

    public ListaFrutas() {
        // Instanciando un ArrayList<String> en el atributo
        listaCadenas = new ArrayList<>();

        // Agregando 10 cadenas de texto diferentes al ArrayList
        listaCadenas.add("Manzana");
        listaCadenas.add("Naranja");
        listaCadenas.add("Plátano");
        listaCadenas.add("Uva");
        listaCadenas.add("Fresa");
        listaCadenas.add("Melón");
        listaCadenas.add("Pera");
        listaCadenas.add("Kiwi");
        listaCadenas.add("Sandía");
        listaCadenas.add("Durazno");

        // Ordenando las cadenas de texto en el ArrayList usando el método sort
        Collections.sort(listaCadenas);
    }

    // Puedes agregar otros métodos si lo necesitas
}
