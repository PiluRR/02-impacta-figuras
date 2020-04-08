package oop.model;

public class Triangulo extends Figura {

    public Triangulo() {
        super(5, 9, "@", "-");
    }

    @Override
    public String desenhar() {
        int meio = getLargura() / 2;
        StringBuilder desenho = new StringBuilder();
        desenho.append(this.toString());
        for (int linha = 0; linha < getAltura(); linha++) {
            for (int coluna = 0; coluna < getLargura(); coluna++) {
                if (coluna >= meio - linha && coluna <= meio + linha) {
                    desenho.append(getSimbolo()).append(" ");
                } else {
                    desenho.append(getFundo()).append(" ");
                }
            }
                desenho.append("\n");
        }
        return desenho.toString();
    }
}
