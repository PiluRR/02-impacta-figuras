package oop.test;

import oop.model.Quadrado;
import oop.model.Retangulo;
import oop.model.Triangulo;

public class FiguraTest {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5, 5, "$");
        System.out.println(quadrado.desenhar());

        Retangulo retangulo = new Retangulo(5, 9, "#", " ");
        System.out.println(retangulo.desenhar());

        Triangulo triangulo = new Triangulo(5, 9, "@", "-");
        System.out.println(triangulo.desenhar());
    }
}
