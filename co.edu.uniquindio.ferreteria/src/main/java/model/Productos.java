package model;

public class Productos {
    private String cod;
    private String nombrePro;
    private int cant;

    private double precio;

    public Productos(String cod, String nombrePro, int cant, double precio)
    {
        this.cod = cod;
        this.nombrePro = nombrePro;
        this.cant = cant;
        this.precio = precio;
    }

    public String getCod()
    {
        return cod;
    }

    public void setCod(String cod)
    {
        this.cod = cod;
    }

    public String getNombrePro()
    {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro)
    {
        this.nombrePro = nombrePro;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    Productos miProductos1 = new Productos("0001", "puntilla", 12, 1200.00);
    Productos miProductos2 = new Productos("0002", "amarras", 12, 2000.00);
    Productos miProductos3 = new Productos("0003", "martillo", 1, 28200.00);
    Productos miProductos4 = new Productos("0004", "metro", 1, 5600.00);
    Productos miProductos5 = new Productos("0005", "tornillo", 1, 100.00);




}
