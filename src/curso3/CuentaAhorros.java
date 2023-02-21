package curso3;

public class CuentaAhorros extends Cuenta{
    public CuentaAhorros(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;

    }
}
