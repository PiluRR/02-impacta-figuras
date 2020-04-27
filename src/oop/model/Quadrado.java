package oop.model;

import oop.model.domain.UniDimensional;

public class Quadrado extends Figura implements UniDimensional {

    public Quadrado() {
        super(5, "Q");
    }

    @Override
    public void setLado(int lado) {
        super.setAltura(lado);
        super.setLargura(lado);
    }

    @Override
    public String desenhar() {
        StringBuilder desenho = new StringBuilder();

        desenho.append(this.toString());
        for(int linha = 0; linha < getAltura(); linha++) {
            for(int coluna = 0; coluna < getLargura(); coluna++) {
                desenho.append(getSimbolo() + " ");
            }
            desenho.append("\n");
        }
        return desenho.toString();
    }
}
