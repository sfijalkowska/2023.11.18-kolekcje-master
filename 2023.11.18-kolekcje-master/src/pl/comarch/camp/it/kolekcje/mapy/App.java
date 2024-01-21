package pl.comarch.camp.it.kolekcje.mapy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap();
        mapa.put(7, "Janusz");
        mapa.put(10, "Wiesiek");
        mapa.put(15, "Zbyszek");
        mapa.put(7, "Mateusz");

        System.out.println(mapa.get(7));
        System.out.println(mapa.get(15));
        System.out.println(mapa.get(100));

        HashMap<String, Double> innaMapa = new HashMap<>();
        innaMapa.put("Wiesiek", 55.54);
        innaMapa.put("Karok", 2345.75);
        innaMapa.put("Janusz", 234.44);

        System.out.println(innaMapa.get("Wiesiek"));

        HashMap<String, String> mapa3 = new HashMap<>();
        mapa3.put("432jh3hjhjk34", "Reksio");
        mapa3.put("sdfg78sdfg", "Rex");

        BazaDanych bazaDanych = new BazaDanych();
        HashMap<String, Pet> mapa4 = new HashMap<>();
        mapa4.put("k453kjhg345", bazaDanych.getPies());

        Pet pies = mapa4.get("k453kjhg345");
        System.out.println(pies.name);
        System.out.println(pies.id);
        System.out.println(pies.owner);
        System.out.println(pies.age);

        System.out.println(mapa.size());

        Set<Integer> set = mapa.keySet();
        System.out.println(set);

        Collection<String> values = mapa.values();
        System.out.println(values);

        Set<Map.Entry<Integer, String>> zbiorPar = mapa.entrySet();
        System.out.println(zbiorPar);
        /*for(Map.Entry<Integer, String> para : zbiorPar) {
            System.out.println(para.getKey() + " - " + para.getValue());
        }*/
    }
}
