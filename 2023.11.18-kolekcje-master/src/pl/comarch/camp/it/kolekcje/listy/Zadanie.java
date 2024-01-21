package pl.comarch.camp.it.kolekcje.listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Zadanie {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            lista1.add(random.nextInt(0, 100));
            lista2.add(random.nextInt(0, 100));
        }
        System.out.println(lista1);
        System.out.println(lista2);
        lista1.addAll(lista2);
        System.out.println(lista1);

        List<Integer> lista3 = List.of(1,2,3,4,5,6,7,8);
    }
}
