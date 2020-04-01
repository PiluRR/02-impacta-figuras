package oop.model;

public class Triangulo {
    public int altura;     //DEFINE A ALTURA DO OBJETO (LINHAS)
    public int largura;    //DEFINE A LARGURA DO OBJETO (COLUNAS)
    public String simbolo; //DEFINE O CARACTER QUE O OBJETO SERA PREENCHIDO
    public String fundo;   //DEFINE O CARACTER DE FUNDO QUE O OBJETO SERA PREENCHIDO

    public void desenhar() {
        System.out.printf("TRIÂNGULO (%d x %d)\n", altura, largura);
        String[][] triangulo = new String[altura][largura];
        for (int linha = 0; linha < triangulo.length; linha++) {
            for (int coluna = 0; coluna < triangulo[linha].length; coluna++) {
                if (coluna >= triangulo[linha].length / 2 - linha && coluna <= triangulo[linha].length / 2 + linha) {
                    triangulo[linha][coluna] = simbolo;
                    System.out.print(triangulo[linha][coluna]);
                } else {
                    triangulo[linha][coluna] = fundo;
                    System.out.print(triangulo[linha][coluna]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
