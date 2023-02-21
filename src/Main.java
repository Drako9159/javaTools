public class Main {

    public static void main(String[] args) {
        //Example example = new Example();
        //example.person("Antonio", 26, "Jaramillo");
        // Cuenta cuentaDiego = new Cuenta();
        //double value = 23;
        //cuenta.depositar(value);
        Cuenta cuenta = new Cuenta(0);

        Cliente cliente = new Cliente();
        cuenta.setTitular(cliente);
        cuenta.getTitular().setName("Diego");
        cuenta.getTitular().setDocument("9837459843");
        cuenta.getTitular().setPhone("5532317335");
        cuenta.agencia = 2;
        double saldo = 20;
        cuenta.setSaldo(saldo);
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getTitular().getName());

        Cuenta.getTotal();








    }
}