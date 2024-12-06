package ifma.lista01;
import java.util.Arrays;

public class CadastrarAlunos {
    private Aluno [] alunos;
    private int size;

    public CadastrarAlunos(int tamanho) {
        this.alunos = new Aluno[tamanho];
        this.size = 0;
    }

    public void adicionarNoFinal(Aluno aluno){
        if (size == alunos.length) {
            throw new RuntimeException("Não há espaço!");
        }
        alunos[size] = aluno;
        size++;
    }

    public void adicionarNoInicio(Aluno aluno) {
        if (size == alunos.length) {
            throw new RuntimeException("Não há espaço!");
        }
        for (int i = size; i > 0; i--) {
            alunos[i] = alunos[i - 1];
        }
        alunos[0] = aluno;
        size++;
    }

    public Aluno removerNoFinal() {
        if (size == 0) {
            throw new RuntimeException("Não existem alunos matriculados!");
        }
        Aluno alunoRemovido = alunos[size - 1];
        alunos[size - 1] = null;
        size--;
        return alunoRemovido;
    }

    public Aluno removerNoInicio() {
        if (size == 0) {
            throw new RuntimeException("Não existem alunos matriculados!");
        }
        Aluno alunoRemovido = alunos[0];
        for (int i = 0; i < size - 1; i++) {
            alunos[i] = alunos[i + 1];
        }
        alunos[size - 1] = null;
        size--;
        return alunoRemovido;
    }

    public boolean verificarIndice(int indice) {
        return indice >= 0 && indice < size && alunos[indice] != null;
    }

    public String removerComIndice(int indice) {
        if (!verificarIndice(indice)) {
            throw new RuntimeException("Indice inválido!");
        }
        if (indice == 0) {
            return removerNoInicio().getNome();
        } else if (indice == size - 1) {
            return removerNoFinal().getNome();
        } else {
            Aluno alunoRemovido = alunos[indice];
            for (int i = indice; i < size - 1; i++) {
                alunos[i] = alunos[i + 1];
            }
            alunos[size - 1] = null;
            size--;
            return alunoRemovido.getNome();
        }
    }

    public void  ordenarVetor() {
        Arrays.sort(alunos, 0, size, (a1, a2) -> Integer.compare(a1.getCodigo(), a2.getCodigo()));
    }

    public void exibirAlunos() {
        for (int i = 0; i < size; i++) {
            System.out.println(alunos[i]);
        }
    }

}
