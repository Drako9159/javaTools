package curso3;

public class TestControlerBonification {
    public static void main(String[] args) {
        // abstract class is not instansiable, only use with Contable
        Functionario drako = new Contable();
        drako.setSalary(2000);

        Manager jimena = new Manager();
        jimena.setSalary(2000);

        Contable alex = new Contable();
        alex.setSalary(1500);

        ControllerBonification controllerBonification = new ControllerBonification();
        controllerBonification.registerSalary(drako);
        controllerBonification.registerSalary(jimena);
        controllerBonification.registerSalary(alex);

    }
}
