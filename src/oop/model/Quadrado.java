package oop.model;

public class Quadrado extends Figura {

    public Quadrado(int altura, int largura, String simbolo) {
        super(altura, largura, simbolo);
    }

    public String desenhar() {
        StringBuilder desenho = new StringBuilder();

        desenho.append(this.toString());
        for (int linha = 0; linha < getAltura(); linha++) {
            for (int coluna = 0; coluna < getLargura(); coluna++) {
                desenho.append(getSimbolo() + "  ");
            }
            desenho.append("\n");
        }
        return desenho.toString();
    }
}
