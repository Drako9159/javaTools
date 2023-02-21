package curso3;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(int agency, int number){
        super(agency, number);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;

    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double comision = 0.2;
        super.saca(valor + comision);
    }
}
