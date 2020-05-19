package com.me.window;

/**
 *
 * @author JAMES
 */
public class Convierte {
    //recibe un real y lo devuelve en cadena
    public static String aCadena(double x){
        return String.valueOf(x);
    }
    
    //recibe un entero y lo devuelve en cadena
    public static String aCadena(int x){
        return String.valueOf(x);
    }
    
    //recibe una cadena y lo devuelve en real
    public static double aReal(String str){
        return Double.valueOf(str).doubleValue();
    }
    
    //recibe una cadena y lo devuelve en entero
    public static int aEntero(String str){
        return Integer.valueOf(str).intValue();
    }
    
    /**Ceates a new instance of Convierte */
    public Convierte(){
    }
}
