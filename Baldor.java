package com.me.window;

/**
 *
 * @author JAMES
 */
public class Baldor extends Convierte{
    
    //recibe 2 valores reales y devuelve su suma
    public static double suma(double v1, double v2){
        return v1 + v2;
    }
    
    //recibe 2 cadenas, las convierte en valor y devuelve la suma en cadena
    public static String suma(String s1, String s2){
        return aCadena(aReal(s1)+aReal(s2));
    }
    
    //recibe 2 valores reales y devuelve la resta
    public static double resta(double v1, double v2){
        return v1 - v2;
    }
    
    //recibe 2 cadenas, las convierte en valor y devuelve la resta en cadena
    public static String resta(String s1, String s2){
        return aCadena(aReal(s1)-aReal(s2));
    }
    
    //recibe 2 valores reales y devuelve el producto
    public static double multiplica(double v1, double v2){
        return v1 * v2;
    }
    
    //recibe 2 cadenas, las convierte en valor y devuelve el producto en cadena
    public static String multiplica(String s1, String s2){
        return aCadena(aReal(s1)*aReal(s2));
    }
    
    //recibe 2 valores reales y devuelve la division
    public static double divide(double v1, double v2){
        return v1/v2;
    }
    
    //recibe 2 cadenas, las convierte en valor y devuelve el producto en cadena
    public static String divide(String s1, String s2){
        return aCadena(aReal(s1)/aReal(s2));
    }
    
    /** Creates a new instance of Baldor */
    public Baldor() {
    }
}
