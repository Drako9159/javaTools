package curso3;

public class TestManager {
    public static void main(String[] args) {
        Manager gerente = new Manager();
        gerente.setSalary(6000);
        gerente.setClave("AluraOnline");
        gerente.setTipo(1);

        //System.out.println(gerente.isLogin("AluraOnline"));
        System.out.println(gerente.getBonification());
    }
}
