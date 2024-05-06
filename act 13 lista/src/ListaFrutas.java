import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListaFrutas {

    public List<String> listaCadenas;

    public ListaFrutas() {
        listaCadenas = new ArrayList<>();
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
    }

    // Método para imprimir la lista
    public void imprimirLista(String mensaje) {
        System.out.println(mensaje + ": " + listaCadenas);
    }

    // Ordenar la lista
    public void ordenarLista(Comparator<String> comparador) {
        Collections.sort(listaCadenas, comparador);
    }

    // Método main para ejecutar el código
    public static void main(String[] args) {
        ListaFrutas frutas = new ListaFrutas();

        // Ordenar por longitud usando clase anónima
        frutas.ordenarLista(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        frutas.imprimirLista("Ordenado por longitud (clase anónima)");

        // Ordenar por longitud usando expresión lambda
        frutas.ordenarLista((s1, s2) -> s1.length() - s2.length());
        frutas.imprimirLista("Ordenado por longitud (expresión lambda)");

        // Ordenar por longitud usando método de referencia
        frutas.ordenarLista(String::compareToIgnoreCase);
        frutas.imprimirLista("Ordenado por longitud (método de referencia)");

        // Ordenar alfabéticamente usando clase anónima
        frutas.ordenarLista(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
        frutas.imprimirLista("Ordenado alfabéticamente (clase anónima)");

        // Ordenar alfabéticamente usando expresión lambda
        frutas.ordenarLista((s1, s2) -> s1.compareToIgnoreCase(s2));
        frutas.imprimirLista("Ordenado alfabéticamente (expresión lambda)");

        // Ordenar alfabéticamente usando método de referencia
        frutas.ordenarLista(String::compareTo);
        frutas.imprimirLista("Ordenado alfabéticamente (método de referencia)");
    }
}
