package curso3;

public class Admin extends Functionario implements Autenticable{


    private AutenticationUtil util;

    public Admin(){
        this.util = new AutenticationUtil();
    }
    @Override
    public double getBonification() {
        return this.getSalary();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);

    }

    @Override
    public boolean isLogin(String clave) {
        return this.util.isLogin(clave);
    }
}
