package br.com;

import model.Clase;

import java.util.*;

public class Curso {

    private String name;
    private int time;
    private List<Clase> claseList = new ArrayList<>();
    //private List<Aula> AulaList = new ArrayList<>();
    private Map<String, Alumno> alumnoMap= new HashMap<>();
    private Collection<Alumno> alumnos = new HashSet<>();


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
    /*
    // Add unmodificable list in class Aula
    public List<Aula> getAulaList(){
        return Collections.unmodifiableList(aulaList);
    }*/
    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }
    public void addClase(Clase clase){
        this.claseList.add(clase);
    }
    public void addAlumno(Alumno alumno){ this.alumnos.add(alumno); this.alumnoMap.put(alumno.getCodigo(), alumno); }
    public boolean verificarAlumno(Alumno alumno){ return this.alumnos.contains(alumno); }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }

    public void setAlumnoMap(Map<String, Alumno> alumnoMap) {
        this.alumnoMap = alumnoMap;
    }

    public void setAlumnos(Collection<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString(){ return this.name; };



}
