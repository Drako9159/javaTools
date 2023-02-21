package curso3;

public abstract class Cuenta {
    protected double saldo;
    private int agency = 1;
    private int number;
    private Cliente titular = new Cliente();
    // static for only class, not instanciable, only's use Cuenta.count
    private static int total;
    public static int getTotal() {
        return Cuenta.total;
    }
    public Cuenta(){

    }
    public Cuenta(int agency, int number){
        this.agency = agency;
        this.number = number;
        System.out.println("Estoy creando una cuenta");
    }


    public abstract void depositar(double valor);
    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo -= valor;

    }
    public boolean transfiere(double valor, Cuenta destino){
        if(this.saldo >= valor){
            try {
                this.saca(valor);
            } catch (SaldoInsuficienteException e) {
                e.printStackTrace();
            }
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public void values(double saldo, int agencia, int numero, String titular){
        this.saldo = saldo;
        this.agency = agencia;
        this.number = numero;
        Cuenta.total ++;

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


