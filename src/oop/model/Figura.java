package oop.model;

public class Figura {
    private int altura;
    private int largura;
    private String simbolo;
    private String fundo;

    public Figura() {
        super();
    }

    public Figura(int altura, int largura, String simbolo) {
        this.altura = altura;
        this.largura = largura;
        this.simbolo = simbolo;
    }

    public Figura(int altura, int largura, String simbolo, String fundo) {
        super();
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

    @Override
    public String toString() {
        return String.format("%s (%d x %d)\n", getClass().getSimpleName(), getAltura(), getLargura());
    }
}
