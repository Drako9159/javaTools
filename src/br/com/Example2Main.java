package br.com;

import java.util.*;
import java.util.stream.Collectors;

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

        // suma los teimpos del curso
        System.out.println(example.stream().mapToInt(Example2::getTime).sum());
        // get max number
        System.out.println(example.stream().mapToInt(Example2::getTime).max().getAsInt());
        // filter witout Espanhol
        System.out.println(example.stream().filter(name -> !name.getName().equalsIgnoreCase("Espanhol")).mapToInt(Example2::getTime).max().getAsInt());
        // get average
        System.out.println(example.stream().mapToInt(Example2::getTime).average().getAsDouble());
        // get min number
        System.out.println(example.stream().mapToInt(Example2::getTime).min());

        // agroup
        Map<String, List<Example2>> groupCurso = example.stream().collect(Collectors.groupingBy(Example2::getName));
        groupCurso.forEach((key, value) -> System.out.println(key + "." +value.size()));
        // parallelStream for more eficiente stream
        System.out.println(example.parallelStream().mapToInt(Example2::getTime).sum());
    }
}
