package oop.test;

import oop.model.Quadrado;
import oop.model.Retangulo;
import oop.model.Triangulo;

public class FiguraTest {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setAltura(5);
        quadrado.setLargura(5);
        quadrado.setSimbolo("$");
        System.out.println(quadrado.desenhar());

        Retangulo retangulo = new Retangulo();
        retangulo.altura = 5;
        retangulo.largura = 9;
        retangulo.simbolo = "#";
        retangulo.fundo = "-";
        System.out.println(retangulo.desenhar());

        Triangulo triangulo = new Triangulo();
        triangulo.altura = 5;
        triangulo.largura = 9;
        triangulo.simbolo = "@";
        triangulo.fundo = "-";
        triangulo.desenhar();
    }
}
