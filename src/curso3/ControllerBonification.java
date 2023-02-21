package curso3;

public class ControllerBonification {
    private double suma;

    public double registerSalary(Functionario functionario){
        this.suma = functionario.getBonification() + this.suma;
        System.out.println(this.suma);
        return this.suma;
    }

}
