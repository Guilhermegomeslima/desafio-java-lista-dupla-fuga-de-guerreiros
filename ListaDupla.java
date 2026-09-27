public class ListaDupla{
    private No cabeca;
    private No cauda;
    private int tamanho;

    public ListaDupla() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public void inserirInicio(String nome){
        No novo = new No(nome);
        
        if (cabeca == null) {
            cabeca = novo;
            cauda = novo;
        } else {
            novo.proximo = cabeca;
            cabeca.anterior = novo;
            cabeca = novo;
        }
        tamanho++;
    }

    public void inserirFim(String nome) {
        No novo = new No(nome);

        if (cabeca == null) {
            cabeca = novo;
            cauda = novo;
        } else {
            novo.anterior = cauda;
            cauda.proximo = novo;
            cauda = novo;
        }
        tamanho++;
    }

    public void imprimir() {
        No atual = cabeca;

        while (atual != null) {
            System.out.print(atual.nome + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }

    public int tamanho(){
        return tamanho;        
    }

    public String obter(int pos) {
        No atual = cabeca;

        if(pos < 0 || pos >= tamanho) {
        return null;
        }

        for (int i = 0; i < pos; i++) {
            atual = atual.proximo;
        }
        return atual.nome;
    }
}
