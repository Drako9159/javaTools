package model;

import br.com.Example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Curso example1 = new Curso("Geometria", 30);
        example1.addClase(new Clase("ArrayList"));

        ArrayList<Curso> example = new ArrayList<>();
        example.add(example1);

        System.out.println(example1.getClaseList());

    }
}
