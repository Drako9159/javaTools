package curso3;

public class Cliente implements Autenticable{
    private String name;
    private String document;
    private String phone;

    private AutenticationUtil util;



    public Cliente(){
        this.util = new AutenticationUtil();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);

    }

    @Override
    public boolean isLogin(String clave) {

        return this.util.isLogin(clave);

    }
}
