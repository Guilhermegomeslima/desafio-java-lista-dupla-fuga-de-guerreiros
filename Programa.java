public class Programa {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        lista.inserirInicio("Guan Yu");
        lista.inserirInicio("portao 1");
        lista.inserirFim("portao 2");
        lista.imprimir();
        System.out.println("tamanho da lista: " +  lista.tamanho());
        System.out.println(lista.obter(2));
    }
}