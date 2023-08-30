class FloodFill {
    public static void inundacaoPilha(int[][] matriz, int linha, int coluna, int valorAlvo, int substituto) {
        imprimirMatriz(matriz, "Matriz inicial:");
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

            pilha.empilhar(y - 1);
            pilha.empilhar(x);
            pilha.empilhar(y + 1);
            pilha.empilhar(x);
            pilha.empilhar(y);
            pilha.empilhar(x - 1);
            pilha.empilhar(y);
            pilha.empilhar(x + 1);
        }
        imprimirMatriz(matriz, "Matriz final após inundação por pilha:");
    }

    public static void inundacaoFila(int[][] matriz, int linha, int coluna, int valorAlvo, int substituto) {
        imprimirMatriz(matriz, "Matriz inicial:");
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

            fila.enfileirar(y - 1);
            fila.enfileirar(x);
            fila.enfileirar(y + 1);
            fila.enfileirar(x);
            fila.enfileirar(y);
            fila.enfileirar(x - 1);
            fila.enfileirar(y);
            fila.enfileirar(x + 1);
        }
        imprimirMatriz(matriz, "Matriz final após inundação por fila:");
    }

    private static void imprimirMatriz(int[][] matriz, String mensagem) {
        System.out.println(mensagem);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
