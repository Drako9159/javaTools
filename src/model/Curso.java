package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String name;
    private int time;
    private List<Clase> claseList = new ArrayList<>();

    public Curso(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Curso(String name, int time, List<Clase> claseList) {
        this.name = name;
        this.time = time;
        this.claseList = claseList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public List<Clase> getClaseList() {
        return claseList;
    }
    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }
    public void addClase(Clase clase){
        this.claseList.add(clase);
    }

    @Override
    public String toString(){ return this.name; };



}
