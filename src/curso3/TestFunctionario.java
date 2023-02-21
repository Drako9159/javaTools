package curso3;

public class TestFunctionario {
    public static void main(String[] args) {
        Functionario antonio = new Contable();
        antonio.setName("Antonio");
        antonio.setDocument("w98723489");
        antonio.setSalary(5000);
        antonio.setTipo(0);


        System.out.println(antonio.getBonification());
    }
}
