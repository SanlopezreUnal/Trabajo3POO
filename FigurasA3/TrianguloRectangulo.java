/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas_a3;

/**
 *
 * @author LENOVO
 */
public class TrianguloRectangulo {
    double base;
    double altura;

    public static double calcularArea(double base, double altura) {
        return (base * altura / 2);
    }

    public static double calcularPerimetro(double base, double altura) {
        return (base + altura + calcularHipotenusa(base, altura));
    }

    public static double calcularHipotenusa(double base, double altura) {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    public static String determinarTipoTriangulo(double base, double altura) {
        if ((base == altura) && (base == calcularHipotenusa(base, altura)) && (altura == calcularHipotenusa(base, altura))) {
            return "Es un triangulo equilatero";
        } else if ((base != altura) && (base != calcularHipotenusa(base, altura)) && (altura != calcularHipotenusa(base, altura))) {
            return "Es un triangulo escaleno";
        } else {
            return "Es un triangulo isosceles";
        }
    }
}
