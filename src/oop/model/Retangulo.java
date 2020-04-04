package oop.model;

public class Retangulo extends Figura {

    public Retangulo(int altura, int largura, String simbolo, String fundo) {
        super(altura, largura, simbolo, fundo);
    }

    public String desenhar() {
        StringBuilder desenho = new StringBuilder();
        desenho.append(this.toString());
        for (int linha = 0; linha < getAltura(); linha++) {
            for (int coluna = 0; coluna < getLargura(); coluna++) {
                if(linha == 0 || linha == getAltura() - 1 || coluna == 0 || coluna == getLargura() - 1) {
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