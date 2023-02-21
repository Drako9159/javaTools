package exceptions;

import com.sun.security.jgss.GSSUtil;

public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin de main");
    }
    public static void metodo1(){
        System.out.println("Inicio método 1");
        metodo2();
        System.out.println("Fin de metodo 1");
    }
    public static void metodo2(){
        System.out.println("Inicio de metodo 2");
        try {
            for(int i =1; i<= 5; i++){
                System.out.println(i);
            }
        } catch(ArithmeticException | NullPointerException exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        } finally {
            System.out.println("Ejecutando finally");
        }
        System.out.println("Fin de metodo 2");
        // error exect
        // throw new ArithmeticException();
        throw new MyException("Mi exception is launched");
    }
}
