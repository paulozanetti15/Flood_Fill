class FloodFill {
    public static void inundacaoPilha(int[][] matriz, int linha, int coluna, int valorAlvo, int substituto) {
        int numLinhas = matriz.length;
        int numColunas = matriz[0].length;

        Pilha pilha = new Pilha(numLinhas * numColunas);
        pilha.empilhar(linha);
        pilha.empilhar(coluna);

        while (!pilha.estaVazia()) {
            int y = pilha.desempilhar();
            int x = pilha.desempilhar();

            if (x < 0 || x >= numColunas || y < 0 || y >= numLinhas || matriz[y][x] != valorAlvo) {
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
    }

    public static void inundacaoFila(int[][] matriz, int linha, int coluna, int valorAlvo, int substituto) {
        int numLinhas = matriz.length;
        int numColunas = matriz[0].length;

        Fila fila = new Fila(numLinhas * numColunas);
        fila.enfileirar(linha);
        fila.enfileirar(coluna);

        while (!fila.estaVazia()) {
            int y = fila.desenfileirar();
            int x = fila.desenfileirar();

            if (x < 0 || x >= numColunas || y < 0 || y >= numLinhas || matriz[y][x] != valorAlvo) {
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
    }
}
