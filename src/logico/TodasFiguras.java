package logico;

public class TodasFiguras {
    public static void main(String[] args) {
        System.out.println("QUADRADO");
        String [] [] quadrado = new String[5][5];
        for (int linha = 0; linha < quadrado.length; linha++) {
            for (int coluna = 0; coluna < quadrado[linha].length; coluna++) {
                quadrado[linha][coluna] = "o";
                System.out.print(quadrado[linha][coluna] + "  ");
            }
            System.out.println();
        }
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
        System.out.println("TRIÂNGULO");
        String[][] triangulo = new String[5][9];
        int modificador = 0;
        for (int linha = 0; linha < triangulo.length; linha++) {
            for (int coluna = 0; coluna < triangulo[linha].length; coluna++) {
                if (coluna >= triangulo[linha].length / 2 - modificador && coluna <= triangulo[linha].length / 2 + modificador) {
                    triangulo[linha][coluna] = "o";
                    System.out.print(triangulo[linha][coluna]);
                } else {
                    triangulo[linha][coluna] = " ";
                    System.out.print(triangulo[linha][coluna]);
                }
                System.out.print(" ");
            }
            modificador++;
            System.out.println();
        }
    }
}
