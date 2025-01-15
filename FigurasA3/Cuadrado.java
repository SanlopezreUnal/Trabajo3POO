/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas_a3;

/**
 *
 * @author LENOVO
 */
public class Cuadrado {
    double lado;

    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetro(double lado) {
        return 4 * lado;
    }
}
