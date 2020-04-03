package oop.model;

public class Retangulo {
    private int altura;     //DEFINE A ALTURA DO OBJETO (LINHAS)
    private int largura;    //DEFINE A LARGURA DO OBJETO (COLUNAS)
    private String simbolo; //DEFINE O CARACTER QUE O OBJETO SERA PREENCHIDO
    private String fundo;   //DEFINE O CARACTER DE FUNDO QUE O OBJETO SERA PREENCHIDO

    public Retangulo() {}

    public Retangulo(int altura, int largura, String simbolo, String fundo) {
        this.altura = altura;
        this.largura = largura;
        this.simbolo = simbolo;
        this.fundo = fundo;
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

    public String getFundo() {
        return fundo;
    }

    public void setFundo(String fundo) {
        this.fundo = fundo;
    }

    public String desenhar() {
        StringBuilder desenho = new StringBuilder();
        desenho.append(this.toString());
        for (int linha = 0; linha < getAltura(); linha++) {
            for (int coluna = 0; coluna < getLargura(); coluna++) {
                if(linha == 0 || linha == getAltura() - 1 || coluna == 0 || coluna == getLargura() - 1) {
                    desenho.append(simbolo + " ");
                } else {
                    desenho.append(fundo + " ");
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