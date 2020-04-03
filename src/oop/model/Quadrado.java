package oop.model;

public class Quadrado {
    private int altura;     //DEFINE A ALTURA DO OBJETO (LINHAS)
    private int largura;    //DEFINE A LARGURA DO OBJETO (COLUNAS)
    private String simbolo; //DEFINE O CARACTERE QUE O OBJETO SERA PREENCHIDO

    public Quadrado() {}

    public Quadrado(int altura, int largura, String simbolo) {
        this.altura = altura;
        this.largura = largura;
        this.simbolo = simbolo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
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

    @Override
    public String toString() {
        return String.format("%s (%d x %d)\n", getClass().getSimpleName(), getAltura(), getLargura());
    }
}
