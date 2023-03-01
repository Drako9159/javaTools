package model;

public class Clase {

    private String name;


    public Clase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){ return this.name; };



}
