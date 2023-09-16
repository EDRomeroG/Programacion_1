package model;

public class Docente

    {
        private String nombre;
        private String apellido;
        private int edad;
        private String correo;

    public Docente(String nombre,String apellido, int edad, String correo)
    {
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad = edad;
        this.correo = correo;
    }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getNombre()
        {
        return nombre;
        }

        public void setNombre(String nombre)
        {
        this.nombre = nombre;
        }

        public int getEdad() {
        return edad;
    }

        public void setEdad(int edad) {
        this.edad = edad;
    }

        public String getCorreo() {
        return correo;
    }

        public void setCorreo(String correo)
        {
        this.correo = correo;
    }


        /**
         * Metodo que calcula el promedio del curso
         * @param notaEstudiante1
         * @param notaEstudiante2
         * @param notaEstudiante3
         * @return double promedioCurso
         */
        public double calcularPromedioCurso(double notaEstudiante1,double notaEstudiante2, double notaEstudiante3 ){
        double promedioCurso = 0.0;
        promedioCurso = (notaEstudiante1+notaEstudiante2+notaEstudiante3)/3;

        return promedioCurso;
    }
        public static Estudiante obtenerMayorEstatura(Estudiante Estudiante1, Estudiante estudiante2, Estudiante estudiante3)
        {
            Estudiante estudianteMayorEstatura = Estudiante1;

            if (estudiante2.getEstatura()> estudianteMayorEstatura.getEstatura())
            {
                estudianteMayorEstatura = estudiante2;
            }
            if (estudiante3.getEstatura() > estudianteMayorEstatura.getEstatura())
            {
                estudianteMayorEstatura = estudiante3;
            }


            return estudianteMayorEstatura;

        }
    }


