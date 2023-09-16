package model;

public class Cliente {
    private String nombre;
    private String ced;
    private String tel;

    public Cliente(String nombre, String ced, String tel) {
        this.nombre = nombre;
        this.ced = ced;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public Cliente iniciarCliente()
    {
        Cliente miCliente1 = new Cliente("Juan", "10963", "316599");
        return miCliente1;
    }



}
