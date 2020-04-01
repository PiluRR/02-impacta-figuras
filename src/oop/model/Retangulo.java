package oop.model;

public class Retangulo {
    public int altura;     //DEFINE A ALTURA DO OBJETO (LINHAS)
    public int largura;    //DEFINE A LARGURA DO OBJETO (COLUNAS)
    public String simbolo; //DEFINE O CARACTER QUE O OBJETO SERA PREENCHIDO
    public String fundo;   //DEFINE O CARACTER DE FUNDO QUE O OBJETO SERA PREENCHIDO

    public String desenhar() {
        System.out.printf("RETÂNGULO (%d x %d)\n", altura, largura);
        StringBuilder desenho = new StringBuilder();
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                desenho.append(simbolo + " ");
            }
            desenho.append("\n");
        }
        return desenho.toString();
    }
}