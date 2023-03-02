package model;

import br.com.Example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Curso example1 = new Curso("Geometria", 30);
        example1.addClase(new Clase("ArrayList"));

        ArrayList<Curso> example = new ArrayList<>();
        example.add(example1);

        System.out.println(example1.getClaseList());

        Iterator<Curso> alumnoIterator = example.iterator();
        while (alumnoIterator.hasNext()){
            System.out.println(alumnoIterator.next());
        }

    }
}
