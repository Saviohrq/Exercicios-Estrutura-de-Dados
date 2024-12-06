package ifma.lista03;

public class TesteSimpleList {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();

        // Testando métodos de adição
        list.adicionarInicio(10);
        list.adicionarInicio(5);
        list.adicionarFim(20);
        list.adicionarFim(15);

        System.out.println("Lista atual: " + list);
        System.out.println();

        // Testando remoção
        System.out.println("Removido do início: " + list.removerComeco());
        System.out.println("Removido do final: " + list.removerFinal());
        System.out.println("Lista após remoções: " + list);
        System.out.println();

        // Testando maior, menor e média
        System.out.println("Maior valor: " + list.maiorValor());
        System.out.println("Menor valor: " + list.menorValor());
        System.out.println("Média dos valores: " + list.mediaValores());
        System.out.println();

        // Testando adição
        System.out.println("Lista atual: " + list);
        list.adicionarInicio(30); // adicionar no inicio
        System.out.println("Lista após adicionar no início: " + list);
        list.adicionarFim(40); // adicionar no final
        System.out.println("Lista após adicionar no final: " + list);
    }
}
