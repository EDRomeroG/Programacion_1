package model;

public class Cliente
{
    private String nombre;
    private String ced;
    private String tel;
    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;
    private Cliente cliente4;

    public Cliente(String nombre, String ced, String tel) {
        this.nombre = nombre;
        this.ced = ced;
        this.tel = tel;
    }

    public Cliente()
    {

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

    //Metodo para inicializar los datos del cliente
    public Factura iniciarCliente()
    {
        Factura factura= new Factura();
        cliente1= new Cliente("Juan", "10961", "316599");
        cliente2= new Cliente("Daniel", "10962", "314321");
        cliente3= new Cliente("Pepe", "10963", "310526");
        cliente4= new Cliente("Rosa", "10964", "311323");

        factura.setCliente1(cliente1);
        factura.setCliente2(cliente2);
        factura.setCliente3(cliente3);
        factura.setCliente4(cliente4);

        return factura;
    }

}
