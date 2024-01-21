package pl.comarch.camp.it.kolekcje.zbiory;

import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Janusz");
        set.add("Adam");
        set.add("Zbyszek");
        set.add("Bartek");

        System.out.println(set.size());

        System.out.println(set);

        //System.out.println(set.get(2));

        set.add("Janusz");

        System.out.println(set);

        set.remove("Janusz");
        System.out.println(set);

        for(String imie : set) {
            System.out.println(imie);
        }
    }
}
