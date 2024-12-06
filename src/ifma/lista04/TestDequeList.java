package ifma.lista04;
import java.util.NoSuchElementException;

public class TestDequeList {
    public static void main(String[] args) {
        DequeList deque = new DequeList();

        Aluno a1 = new Aluno("João", 8.5, 7.8);
        Aluno a2 = new Aluno("Maria", 7.1, 9.0);
        Aluno a3 = new Aluno("Carlos", 6.0, 8.5);

        deque.addLast(a1);
        deque.addLast(a2);
        deque.addLast(a3);

        System.out.println("Deque inicial: " + deque);
        System.out.println();

        System.out.println("Primeiro aluno: " + deque.getFirst().getData());
        System.out.println("Último aluno: " + deque.getLast().getData());
        System.out.println();

        deque.removeFirst();
        System.out.println("Após remover o primeiro: " + deque);
        System.out.println();

        deque.removeLast();
        System.out.println("Após remover o último: " + deque);
        System.out.println();

        try {
            Node found = deque.search("Maria");
            System.out.println("Aluno encontrado: " + found.getData());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Estado final do Deque: " + deque);
    }
}
