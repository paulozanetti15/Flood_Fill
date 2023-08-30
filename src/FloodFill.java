class FloodFill {
    public static void inundacaoPilha(int[][] matriz, int linha, int coluna, int valorAlvo, int substituto) {
        Pilha pilha = new Pilha(matriz.length * matriz[0].length);
        pilha.empilhar(linha);
        pilha.empilhar(coluna);

        while (!pilha.estaVazia()) {
            int y = pilha.desempilhar();
            int x = pilha.desempilhar();

            if (x < 0 || x >= matriz[0].length || y < 0 || y >= matriz.length || matriz[y][x] != valorAlvo) {
                continue;
            }

            matriz[y][x] = substituto;
            System.out.println("Matriz modificada:");
            imprimirMatriz(matriz);

            pilha.empilhar(y - 1);
            pilha.empilhar(x);
            pilha.empilhar(y + 1);
            pilha.empilhar(x);
            pilha.empilhar(y);
            pilha.empilhar(x - 1);
            pilha.empilhar(y);
            pilha.empilhar(x + 1);
        }
    }

    public static void inundacaoFila(int[][] matriz, int linha, int coluna, int valorAlvo, int substituto) {
        Fila fila = new Fila(matriz.length * matriz[0].length);
        fila.enfileirar(linha);
        fila.enfileirar(coluna);

        while (!fila.estaVazia()) {
            int y = fila.desenfileirar();
            int x = fila.desenfileirar();

            if (x < 0 || x >= matriz[0].length || y < 0 || y >= matriz.length || matriz[y][x] != valorAlvo) {
                continue;
            }

            matriz[y][x] = substituto;
            System.out.println("Matriz modificada:");
            imprimirMatriz(matriz);

            fila.enfileirar(y - 1);
            fila.enfileirar(x);
            fila.enfileirar(y + 1);
            fila.enfileirar(x);
            fila.enfileirar(y);
            fila.enfileirar(x - 1);
            fila.enfileirar(y);
            fila.enfileirar(x + 1);
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}