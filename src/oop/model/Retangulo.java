package oop.model;

public class Retangulo {
    public int altura;     //DEFINE A ALTURA DO OBJETO (LINHAS)
    public int largura;    //DEFINE A LARGURA DO OBJETO (COLUNAS)
    public String simbolo; //DEFINE O CARACTER QUE O OBJETO SERA PREENCHIDO
    public String fundo;   //DEFINE O CARACTER DE FUNDO QUE O OBJETO SERA PREENCHIDO

    public void desenhar() {
        String[][] retangulo = new String[altura][largura];

        for(int linha = 0; linha < retangulo.length; linha++) {
            for(int coluna = 0; coluna < retangulo[linha].length; coluna++) {
                if(linha == 0 || linha == retangulo.length-1  || coluna == 0 || coluna == retangulo[linha].length-1 ) {
                    retangulo[linha][coluna] = simbolo + " ";
                } else {
                    retangulo[linha][coluna] = fundo + " ";
                }

            }
        }

        System.out.printf("RETANGULO (%d x %d)\n", altura, largura);
        for(int linha = 0; linha < retangulo.length; linha++) {
            for (int coluna = 0; coluna < retangulo[linha].length; coluna++) {
                System.out.print(retangulo[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println();
    }
}