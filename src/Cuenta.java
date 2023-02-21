public class Cuenta {
    private double saldo;
    int agencia;
    int numero;
    private Cliente titular = new Cliente();
    // static for only class, not instanciable, only's use Cuenta.count
    private static int total;
    public static int getTotal() {
        return Cuenta.total;
    }
    public Cuenta(int agencia){
        if (agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
    }


    public void depositar(double valor){
        System.out.println(valor);
    }

    public void values(double saldo, int agencia, int numero, String titular){
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;

    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

