package br.com;

import java.util.HashMap;
import java.util.Map;

public class Alumno {
    private String name;
    private String codigo;


    public Alumno(String name, String codigo) {
        this.name = name;
        this.codigo = codigo;
    }


    public String getName() {
        return name;
    }


    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString(){return this.name;}
    @Override
    public boolean equals(Object obj){
        Alumno alumno = (Alumno) obj;
        return this.name.equals(alumno.getName());
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
