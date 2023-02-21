package curso3;

public class TestReferences {
    public static void main(String[] args) {

        Functionario functionario = new Manager();
        functionario.setName("Drako");
        functionario.setSalary(2000);


        Manager manager = new Manager();
        manager.setName("Jimena");
        manager.setSalary(10000);


    }
}
