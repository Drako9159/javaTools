package br.com;

public class Example2 implements Comparable<Example2> {
    private String name;
    private int time;
    public Example2(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public int compareTo(Example2 o) {
        return this.name.compareTo(o.getName());
    }
}
