package br.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Example2Main {
    public static void main(String[] args) {
        Example2 example1 = new Example2("Geometria", 30);
        Example2 example2 = new Example2("Fisica", 10);
        Example2 example3 = new Example2("Espanhol", 20);
        Example2 example4 = new Example2("Matematicas", 50);

        ArrayList<Example2> example = new ArrayList<>();
        example.add(example1);
        example.add(example2);
        example.add(example3);
        example.add(example4);

        System.out.println(example);

        // order by name
        Collections.sort(example);
        // order revers
        Collections.sort(example, Collections.reverseOrder());
        // evite override
        example.sort(Comparator.comparing(Example2::getName));
        // use collections
        // Collections.sort(example.Comparator.comparing(Example2::getName));

        System.out.println(example);
    }
}
