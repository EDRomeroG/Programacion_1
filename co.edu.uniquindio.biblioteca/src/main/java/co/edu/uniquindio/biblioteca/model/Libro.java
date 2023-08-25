package co.edu.uniquindio.biblioteca.model;

public class Libro
{
    private  String titulo;
    private  String autor;
    private  String Genero;
    private  int numPaginas;
    private  int fechaPublicacion;
    private  String editorial;

    public String getEditorial()
    {
        return editorial;
    }
    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor(String s)
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero()
    {
        return Genero;
    }

    public void setGenero(String genero)
    {
        Genero = genero;
    }

    public int getNumPaginas()
    {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas)
    {
        this.numPaginas = numPaginas;
    }

    public int getFechaPublicacion()
    {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }
}
