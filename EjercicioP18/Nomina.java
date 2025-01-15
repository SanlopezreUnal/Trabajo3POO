/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopp18;

/**
 *
 * @author LENOVO
 */
public class Nomina {
    double nhtm;
    double vht;
    double retencion;
    
    Nomina(double nhtm, double vht, double retencion){
        this.nhtm = nhtm;
        this.vht = vht;
        this.retencion = retencion;
    }
    
    double obtenerSalarioBruto(){
        return nhtm*vht;
    }
    
    double obtenerSalarioNeto(){
        return (nhtm*vht)-((nhtm*vht)*(retencion/100));
    }
    
}
