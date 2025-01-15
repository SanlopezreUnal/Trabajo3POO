/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioa3_rr7;

/**
 *
 * @author LENOVO
 */
public class Validar {
    double a, b;
    
    public static String validar(double a, double b){
        if (a>b){
            return "A es mayor que B";
        }
        else if (a==b){
            return "A es igual a B";
        }
        else{
            return "B es mayor que A";
        }
    }
    
    public static String limpiar_Campos(){
        return "";
    }
    
}
