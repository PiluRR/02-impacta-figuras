package oop.model;

public class Triangulo {
    int altura;     //DEFINE A ALTURA DO OBJETO (LINHAS)
    int largura;    //DEFINE A LARGURA DO OBJETO (COLUNAS)
    String simbolo; //DEFINE O CARACTER QUE O OBJETO SERA PREENCHIDO
    String fundo;   //DEFINE O CARACTER DE FUNDO QUE O OBJETO SERA PREENCHIDO

    public void desenhar() {
        System.out.println("TRIÂNGULO");
        String[][] triangulo = new String[5][9];
        for (int linha = 0; linha < triangulo.length; linha++) {
            for (int coluna = 0; coluna < triangulo[linha].length; coluna++) {
                if (coluna >= triangulo[linha].length / 2 - linha && coluna <= triangulo[linha].length / 2 + linha) {
                    triangulo[linha][coluna] = "o";
                    System.out.print(triangulo[linha][coluna]);
                } else {
                    triangulo[linha][coluna] = " ";
                    System.out.print(triangulo[linha][coluna]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
