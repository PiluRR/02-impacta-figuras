package oop.test;

import oop.model.Figura;
import oop.model.Quadrado;
import oop.model.Retangulo;
import oop.model.Triangulo;

public class FiguraTest {
    public static void main(String[] args) {
        Figura f;

        f = new Quadrado();
        System.out.println(f.desenhar());

        f = new Retangulo();
        System.out.println(f.desenhar());

        f = new Triangulo();
        System.out.println(f.desenhar());
    }
}
