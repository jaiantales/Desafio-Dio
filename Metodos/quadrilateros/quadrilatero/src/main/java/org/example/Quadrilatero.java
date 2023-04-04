package org.example;

public class Quadrilatero {

    public static int area(int lado){
        System.out.println("Quadrado -> Área = "+lado+" cm2");
    }
    public static int area(int lado1, int lado2){
        System.out.println("Retangulo -> Área = "+lado1*lado2+" cm2");
    }

    public static int area(int baseMenor, int baseMaior, int altura){
        System.out.println("Trapezio -> Área = "+((baseMaior+baseMenor)*altura)+" cm2");
    }
}
