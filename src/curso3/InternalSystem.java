package curso3;

public class InternalSystem {
    private String clave = "12345";
    public boolean auth(Autenticable manager){
        boolean pudeIniciarSesion = manager.isLogin(clave);
        if(pudeIniciarSesion){
            System.out.println("Login success");
            return true;
        } else {
            System.out.println("Login failure");
            return false;
        }

    }
}
