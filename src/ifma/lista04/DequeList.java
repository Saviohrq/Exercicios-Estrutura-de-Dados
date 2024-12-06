package ifma.lista04;
import java.util.NoSuchElementException;

public class DequeList {
    private Node head;
    private Node tail;

    public DequeList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(Aluno aluno) {
        Node newNode = new Node(aluno);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public Node getFirst() {
        if (head == null) {
            throw new RuntimeException("Deque vazio!");
        }
        return head;
    }

    public Node getLast() {
        if (tail == null) {
            throw new RuntimeException("Deque vazio!");
        }
        return tail;
    }

    public Aluno removeFirst() {
        Node firstNode = getFirst();
        if (head == tail) {
            head = tail = null;
        } else {
            head = firstNode.getNext();
            head.setPrev(null);
        }
        return firstNode.getData();
    }

    public Aluno removeLast() {
        Node lastNode = getLast();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = lastNode.getPrev();
            tail.setNext(null);
        }
        return lastNode.getData();
    }

    public Node search(String nome) {
        Node atual = head;
        while (atual != null) {
            if (atual.getData().toString().contains(nome)) {
                return atual;
            }
            atual = atual.getNext();
        }
        throw new NoSuchElementException("Aluno não encontrado: " + nome);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node atual = head;
        while (atual != null) {
            sb.append(atual.getData());
            if (atual.getNext() != null) {
                sb.append(", ");
            }
            atual = atual.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
