package ifma.lista03;

public class SimpleList {
    private Node head;

    public void adicionarInicio(int valor) {
        Node newNode = new Node(valor);
        newNode.next = head;
        head = newNode;
    }

    public void adicionarFim(int valor) {
        if (head == null) {
            adicionarInicio(valor);
        } else {
            Node atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = new Node(valor);
        }
    }

    public int removerComeco() {
        if  (head == null) {
            throw new RuntimeException("A lista está vazia!");
        }
        int valor = head.dado;
        head = head.next;
        return valor;
    }

    public int removerFinal() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia!");
        }
        if (head.next == null) {
            return removerComeco();
        }

        Node atual = head;
        while (atual.next.next != null) {
            atual = atual.next;
        }
        int valor = atual.next.dado;
        atual.next = null;
        return valor;
    }

    public int maiorValor() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia!");
        }
        int max = head.dado;
        Node atual = head.next;
        while (atual != null) {
            if (atual.dado > max) {
                max = atual.dado;
            }
            atual = atual.next;
        }
        return max;
    }

    public int menorValor() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia!");
        }
        int min = head.dado;
        Node atual = head.next;
        while (atual != null) {
            if (atual.dado < min) {
                min = atual.dado;
            }
            atual = atual.next;
        }
        return min;
    }

    public double mediaValores() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia!");
        }
        int soma = 0, count = 0;
        Node atual = head;
        while (atual != null) {
            soma += atual.dado;
            count++;
            atual = atual.next;
        }
        return (double) soma / count;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("[");
        Node atual = head;
        while (atual != null) {
            resultado.append(atual.dado);
            if (atual.next != null) {
                resultado.append(", ");
            }
            atual = atual.next;
        }
        resultado.append("]");
        return resultado.toString();
    }
}
