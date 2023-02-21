package curso3;

public class Manager  extends  Functionario implements Autenticable {
    public double getBonification(){
        // super for get collection by father class
        System.out.println("From Manager");
        return super.getSalary() + this.getSalary() * 0.05;
    }
    @Override
    public void setClave(String clave) {
    }
    @Override
    public boolean isLogin(String clave) {
        return false;
    }
}
