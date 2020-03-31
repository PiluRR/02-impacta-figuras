package oop.model;

public class Quadrado {
    int altura;     //DEFINE A ALTURA DO OBJETO (LINHAS)
    int largura;    //DEFINE A LARGURA DO OBJETO (COLUNAS)
    String simbolo; //DEFINE O CARACTERE QUE O OBJETO SERA PREENCHIDO
    public void desenhar() {
        System.out.println("QUADRADO");
        String [] [] quadrado = new String[5][5];
        for (int linha = 0; linha < quadrado.length; linha++) {
            for (int coluna = 0; coluna < quadrado[linha].length; coluna++) {
                quadrado[linha][coluna] = "o";
                System.out.print(quadrado[linha][coluna] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
