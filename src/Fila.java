class Fila {
    private int tamanhoMaximo;
    private int[] arrayFila;
    private int inicio;
    private int fim;
    private int nItens;

    public Fila(int tamanho) {
        tamanhoMaximo = tamanho;
        arrayFila = new int[tamanhoMaximo];
        inicio = 0;
        fim = -1;
        nItens = 0;
    }

    public void enfileirar(int valor) {
        if (fim == tamanhoMaximo - 1) {
            fim = -1;
        }
        arrayFila[++fim] = valor;
        nItens++;
    }

    public int desenfileirar() {
        int temp = arrayFila[inicio++];
        if (inicio == tamanhoMaximo) {
            inicio = 0;
        }
        nItens--;
        return temp;
    }

    public boolean estaVazia() {
        return (nItens == 0);
    }
}