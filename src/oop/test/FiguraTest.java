package oop.test;

import oop.model.Quadrado;
import oop.model.Retangulo;
import oop.model.Triangulo;

public class FiguraTest {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

        quadrado.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }
}
