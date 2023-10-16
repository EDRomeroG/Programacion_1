package programacion1.aritmetica;

import co.edu.uniquindio.aritmetica.model.Aritmetica;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AritmeticaTest
{
    private Aritmetica aritmetica ;
   //crea una instancia antes de ejecutar los metodos
    @BeforeEach
    public void init()
    {
        aritmetica=new Aritmetica();
    }
    @Test
    public void sumarValorEsperadoTest()
    {

        double resultado =aritmetica.sumar(3,4);
        double esperado =7;
        assertEquals(esperado,resultado);


    }
    @Test
    public void sumarValorMayorTest()
    {
        double resultado =aritmetica.sumar(3,4);
        double esperado =7;
        assertTrue(esperado>=resultado);

    }

}
