package ifma.lista04;
import java.util.NoSuchElementException;

public class Node {
    private Aluno data;
    private Node next;
    private Node prev;

    public Node(Aluno data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Aluno getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
