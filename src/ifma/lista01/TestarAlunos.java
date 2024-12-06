package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        Aluno a1 = new Aluno(3, "20240101", "Maria");
        Aluno a2 = new Aluno(1, "20240102", "João");
        Aluno a3 = new Aluno(2, "20240103", "Ana");

        cadastro.adicionarNoFinal(a1);
        cadastro.adicionarNoInicio(a2);
        cadastro.adicionarNoFinal(a3);

        System.out.println("Antes de ordenar:");
        cadastro.exibirAlunos();

        cadastro.ordenarVetor();
        System.out.println("Depois de ordenar:");
        cadastro.exibirAlunos();

        System.out.println("Removendo no início: " + cadastro.removerNoInicio());
        System.out.println("Removendo no final: " + cadastro.removerNoFinal());
        System.out.println("Removendo pelo índice 0: " + cadastro.removerComIndice(0));

        System.out.println("Alunos restantes:");
        cadastro.exibirAlunos();
    }
}
