package br.com;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        // Change element
        lista.set(1, "Ejemplo alterado");

        // Check size
        lista.size();

        // iterate
        for(int i = 0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
        // for each
        for (String clase : lista){
            System.out.println(clase);
        }
        // new version for Each
        lista.forEach(clase -> {
            System.out.println(clase);
        });


        System.out.println(lista);
    }



}
