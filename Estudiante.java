/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioa3_rr10;

/**
 *
 * @author LENOVO
 */
public class Estudiante {
    double pat, est;
    
    public static double obtener_pagmat(double pat, double est) {
        double pagmat = 50000;
        if ((pat>2000000)&& (est>3)){
            pagmat = pagmat + 0.03 * pat;
        }
        return pagmat;
    }
    
    public static String limpiar_Campos(){
        return "";
    }
    
}
