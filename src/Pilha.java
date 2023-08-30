class Pilha {
    private int tamanhoMaximo;
    private int[] arrayPilha;
    private int topoMin;
    private int topoMax;

    public Pilha(int tamanho) {
        tamanhoMaximo = tamanho;
        arrayPilha = new int[tamanhoMaximo];
        topoMin = -1;
        topoMax = 143;
    }

    public void empilhar(int valor) {
        if(topoMin < tamanhoMaximo)
            arrayPilha[++topoMin] = valor;
    }

    public int desempilhar() {
        return arrayPilha[topoMax--];
    }

    public boolean estaVazia() {
        return (topoMax == -1);
    }
}