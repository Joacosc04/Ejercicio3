package com.openbootcamp;

public class Main {
    public static String concatenarTextos (String[] arreglo){
        String concatenado = "";
        for(String texto: arreglo){
            concatenado = concatenado + texto;
        }
        return concatenado;
    }
}
