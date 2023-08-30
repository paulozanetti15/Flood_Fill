public class Main {
    public static void main(String[] args) {
        int numLinhas = 12;
        int numColunas = 12;

        int[][] matriz = new int[numLinhas][numColunas];

        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                if (i == j || j > i) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        int linhaInicioPilha = 0;
        int colunaInicioPilha = 0;
        int alvo = 1;
        int substituto = 9;

        FloodFill.inundacaoPilha(matriz, linhaInicioPilha, colunaInicioPilha, alvo, substituto);

        System.out.println("Usando Pilha:");
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                if (i == j || j > i) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        int linhaInicioFila = 0;
        int colunaInicioFila = 0;

        FloodFill.inundacaoFila(matriz, linhaInicioFila, colunaInicioFila, alvo, substituto);

        System.out.println("\nUsando Fila:");
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}