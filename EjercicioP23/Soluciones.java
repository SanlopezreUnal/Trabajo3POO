/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioc4_a3_p23;

/**
 *
 * @author LENOVO
 */
public class Soluciones {
    double a, b, c;
    
    public static double calcular_solucion1(double a, double b, double c){
        double solucion1;
        return ((-1)*b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
    }
    
    public static double calcular_solucion2(double a, double b, double c){
        double solucion2 ;
        return ((-1)*b - Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
    }
    
    
    public static String limpiar_Campos(){
        return "";
    }
}
