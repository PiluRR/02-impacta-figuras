package oop.model;

import oop.model.domain.BiDimensional;

public class Triangulo extends Figura implements BiDimensional {

    public Triangulo() {
        super(5, 9, "T");
    }

    @Override
    public void setAlt(int altura) {
        super.setAltura(altura);
    }

    @Override
    public void setLarg(int largura) {
        super.setLargura(largura);
    }

    @Override
    public String desenhar() {
        int meio = getLargura() / 2;
        StringBuilder desenho = new StringBuilder();

        desenho.append(this.toString());
        for (int linha = 0; linha < getAltura(); linha++) {
            for (int coluna = 0; coluna < getLargura(); coluna++) {
                if (coluna >= (meio - linha) && coluna <= (meio + linha)) {
                    desenho.append(getSimbolo() + " ");
                } else {
                    desenho.append(getFundo() + " ");
                }
            }
            desenho.append("\n");
        }
        return desenho.toString();
    }

}
