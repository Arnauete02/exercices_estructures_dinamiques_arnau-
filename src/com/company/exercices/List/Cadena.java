package com.company.exercices.List;

public abstract class Cadena {
    public static boolean stringIsInt(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
