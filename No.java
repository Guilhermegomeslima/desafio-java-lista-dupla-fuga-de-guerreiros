public class No {
    public String nome;
    public No proximo;
    public No anterior;

    public No(String nome) {
        this.nome = nome;
        this.proximo = null;
        this.anterior = null;
    }
}