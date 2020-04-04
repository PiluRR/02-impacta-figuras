package oop.model;

public class Triangulo extends Figura {

    public Triangulo(int altura, int largura, String simbolo, String fundo) {
        super(altura, largura, simbolo, fundo);
    }

    public String desenhar() {
        int meio = getLargura() / 2;
        StringBuilder desenho = new StringBuilder();
        desenho.append(this.toString());
        for (int linha = 0; linha < getAltura(); linha++) {
            for (int coluna = 0; coluna < getLargura(); coluna++) {
                if (coluna >= meio - linha && coluna <= meio + linha) {
                    desenho.append(getSimbolo() + " ");
                } else {
                    desenho.append(getFundo() + " ");
                }
            }
                desenho.append("\n");
        }
        return desenho.toString();
    }

    @Override
    public String toString() {
        return String.format("%s (%d x %d)\n", getClass().getSimpleName(), getAltura(), getLargura());
    }
}
