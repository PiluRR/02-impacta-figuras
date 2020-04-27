package oop.model;

import oop.model.domain.BiDimensional;

public class Retangulo extends Figura implements BiDimensional {

    public Retangulo() {
        super(5, 9, "R");
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
        StringBuilder desenho = new StringBuilder();
        desenho.append(this.toString());

        for(int linha = 0; linha < getAltura(); linha++) {
            for(int coluna = 0; coluna < getLargura(); coluna++) {
                if(linha == 0 || linha == getAltura()-1  || coluna == 0 || coluna == getLargura()-1) {
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
