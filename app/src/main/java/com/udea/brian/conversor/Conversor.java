package com.udea.brian.conversor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 06/05/2016.
 */
public class Conversor {

    private static char[] BasesRomano = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    private static int[] BasesDecimal =  new int[]{ 1,   5,   10,  50, 100, 500, 1000};

    public int convertirRomanoADecimal(String numeroRomano){
        int numeroDecimal = 0;
        Character letra = numeroRomano.charAt(numeroRomano.length()-1);
        int ultimoValor = convertirLetraADecimal(letra);
        for(int i=0; i < numeroRomano.length();i++){
            letra = numeroRomano.charAt(numeroRomano.length()-1-i);
            int valorActual = convertirLetraADecimal(letra);
            if(ultimoValor <= valorActual){
                numeroDecimal += valorActual;
            }else{
                numeroDecimal -= valorActual;
            }
            ultimoValor = valorActual;
        }
        return numeroDecimal;
    }

    private int convertirLetraADecimal(Character letra){
        int decimal = 0;
        for(int i=0; i <= BasesRomano.length; i++){
            if(letra == BasesRomano[i]){
                decimal = BasesDecimal[i];
                break;
            }
        }
        return decimal;
    }
}
