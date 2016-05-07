package com.udea.brian.conversor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ConversorTest {
    Conversor conversor = new Conversor();
    int respuesta;
    @Test
    public void testI(){
        respuesta = conversor.convertirRomanoADecimal("I");
        assertEquals(1, respuesta);
    }

    @Test
    public void testII(){
        respuesta = conversor.convertirRomanoADecimal("II");
        assertEquals(2, respuesta);
    }

    @Test
    public void testIII(){
        respuesta = conversor.convertirRomanoADecimal("III");
        assertEquals(3, respuesta);
    }

    @Test
    public void testIV(){
        respuesta = conversor.convertirRomanoADecimal("IV");
        assertEquals(4, respuesta);
    }

    @Test
    public void testV(){
        respuesta = conversor.convertirRomanoADecimal("V");
        assertEquals(5, respuesta);
    }

    @Test
    public void testVI(){
        respuesta = conversor.convertirRomanoADecimal("VI");
        assertEquals(6, respuesta);
    }

    @Test
    public void testVIII(){
        respuesta = conversor.convertirRomanoADecimal("VIII");
        assertEquals(8, respuesta);
    }

    @Test
    public void testIX(){
        respuesta = conversor.convertirRomanoADecimal("IX");
        assertEquals(9, respuesta);
    }

    @Test
    public void testX(){
        respuesta = conversor.convertirRomanoADecimal("X");
        assertEquals(10, respuesta);
    }

    @Test
    public void testXI(){
        respuesta = conversor.convertirRomanoADecimal("XI");
        assertEquals(11, respuesta);
    }

    @Test
    public void testXIV(){
        respuesta = conversor.convertirRomanoADecimal("XIV");
        assertEquals(14, respuesta);
    }

    @Test
    public void testXXIX(){
        respuesta = conversor.convertirRomanoADecimal("XXIX");
        assertEquals(29, respuesta);
    }

    @Test
    public void testDXXXIII(){
        respuesta = conversor.convertirRomanoADecimal("DXXXIII");
        assertEquals(533, respuesta);
    }

    @Test
    public void testCDXLIV(){
        respuesta = conversor.convertirRomanoADecimal("CDXLIV");
        assertEquals(444, respuesta);
    }

    @Test
    public void testCMLXXXVIII(){
        respuesta = conversor.convertirRomanoADecimal("CMLXXXVIII");
        assertEquals(988, respuesta);
    }
}