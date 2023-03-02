package br.com;

import java.util.*;

public class Alumnos {
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Maria";
        String alumno3 = "Juan";
        String alumno4 = "Antonio";
        String alumno5 = "Elena";

        Alumno alumno12 = new Alumno("Luis Miguel", "101");
        Alumno alumno23 = new Alumno("Maria", "102");
        Alumno alumno34 = new Alumno("Juan", "103");
        Alumno alumno45 = new Alumno("Antonio", "104");
        Alumno alumno56 = new Alumno("Elena", "105");

        // Switch for arraylist or hashset
        Set<String> listaAlumnos = new HashSet<>();
        Set<Alumno> listaAlumnos2 = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);

        for(String alumno: listaAlumnos){
            System.out.println(alumno);
        }
        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
        // contain item
        boolean validation = listaAlumnos.contains("Antonio");
        // check max length
        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(max.length());

        // remove condition
        listaAlumnos.removeIf(alumno -> "Antonio".equalsIgnoreCase(alumno));

        Alumno alumnoNuevo = new Alumno("luisillo", "200");

        Optional<Alumno> alumno = listaAlumnos2.stream().filter(a -> "003".equalsIgnoreCase(a.getCodigo())).findFirst();
        if(alumno.isPresent()){
            System.out.println(alumno.get());
        }



    }
}
