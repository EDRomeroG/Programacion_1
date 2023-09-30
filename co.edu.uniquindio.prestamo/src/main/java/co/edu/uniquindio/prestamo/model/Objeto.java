package co.edu.uniquindio.prestamo.model;

public class Objeto
{
    private String nombre;
    private String codigo;
    PrestamoUq ownedByPrestamoUq;



    public Objeto(String nombre, String codigo)
    {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Objeto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String toString()
    {
        return "Objeto: " +"\n"+
                "nombre='" + nombre + '\'' +
                '}';
    }
}
