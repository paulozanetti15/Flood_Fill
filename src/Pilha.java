class Pilha {
    private int tamanhoMaximo;
    private int[] arrayPilha;
    private int topo;

    public Pilha(int tamanho) {
        tamanhoMaximo = tamanho;
        arrayPilha = new int[tamanhoMaximo];
        topo = -1;
    }

    public void empilhar(int valor) {
        arrayPilha[++topo] = valor;
    }

    public int desempilhar() {
        return arrayPilha[topo--];
    }

    public boolean estaVazia() {
        return (topo == -1);
    }
}