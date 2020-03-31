package oop.model;

public class Retangulo {
    int altura;     //DEFINE A ALTURA DO OBJETO (LINHAS)
    int largura;    //DEFINE A LARGURA DO OBJETO (COLUNAS)
    String simbolo; //DEFINE O CARACTER QUE O OBJETO SERA PREENCHIDO
    String fundo;   //DEFINE O CARACTER DE FUNDO QUE O OBJETO SERA PREENCHIDO

    public void desenhar() {
        System.out.println("RETÂNGULO");
        String [] [] retangulo = new String[5][9];
        for (int linha = 0; linha < retangulo.length; linha++) {
            for (int coluna = 0; coluna < retangulo[linha].length; coluna++) {
                if (linha == 0 || linha == retangulo.length - 1) {
                    retangulo[linha][coluna] = "o";
                    System.out.print(retangulo[linha][coluna] + " ");
                } else if (coluna == 0 || coluna == retangulo[linha].length - 1) {
                    retangulo[linha][coluna] = "o";
                    System.out.print(retangulo[linha][coluna] + " ");
                } else {
                    retangulo[linha][coluna] = " ";
                    System.out.print(retangulo[linha][coluna] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
