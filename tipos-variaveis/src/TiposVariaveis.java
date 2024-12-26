public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 22;
        short ano = 2025;
        int cep = 81928329; // se começar com zero, pode ser definido com outro tipo
        long cpf = 98192389189L; // se começar com zero, pode ser definido com outro tipo
        float pi = 3.14F;
        double salario = 2349.66;

        // Exemplo de atribuição de tipos diferentes
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal; // Exemplo com cast, pois numero short não comporta numero int

        // Declaração de constantes
        final double VALOR_DE_PI = 3.14; // por convenção as constantes são atribuidas em caixa alta
        
        // Seu valor não podera ser alterado retornando assim um erro
        // VALOR_DE_PI = 10.75;

        String nome = "Marcelo"; // Representa uma cadeia de caracteres
        char sexo = 'M'; // Representa um unico caracter

        // Representações logicas
        boolean estudante = true;
    }
}
