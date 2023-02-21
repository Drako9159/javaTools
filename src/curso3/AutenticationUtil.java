package curso3;

public class AutenticationUtil {
    private String clave;

    public boolean isLogin(String clave){
        return this.clave == clave;
    }
    public void setClave(String clave){
        this.clave = clave;
    }
}
