package pl.comarch.camp.it.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        System.out.println(lista.size());

        lista.add("Janusz");

        System.out.println(lista.size());

        lista.add("Wiesiek");
        lista.add("Zbyszek");
        //lista.add(5);
        //lista.add(false);

        System.out.println(lista.size());

        System.out.println(lista);

        System.out.println(lista.get(1));

        lista.add(1, "Karol");

        System.out.println(lista);

        ArrayList lista2 = new ArrayList();
        lista2.add("Szymon");
        lista2.add("Mateusz");

        lista.addAll(lista2);

        System.out.println(lista);

        System.out.println(lista.contains("Bogdan"));

        lista.remove(3);

        System.out.println(lista);

        lista.remove("Karol");

        System.out.println(lista);
    }
}
