public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o indice do primeiro elemento sempre inicia em zero
        String[] alunos = { "Marcos", "Ana", "Maria" };

        // Exemplo 1
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno no indice " + i + ": " + alunos[i]);
        }

        // Exemplo 2
        for(String aluno : alunos){
            System.out.println("Aluno: " + aluno);
        }
    }
}
