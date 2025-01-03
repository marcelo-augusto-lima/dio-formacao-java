public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // Também conhecido como resto da divisão
        double resultado = (10 * 7) + (20 / 4); // ordem de procedencia

        System.out.println(soma); // Teste de saida de dados

        String nomeCompleto = "Linguagem" + " Java";
        System.out.println(nomeCompleto); // Podemos observar a concatenação de textos

        int numero = 5;
        numero++; // incremento de + 1, operação por extenso (numero = numero + 1)

        System.out.println(numero);

        boolean verdadeiro = true;
        System.out.println(!verdadeiro); // Negando a operação, sendo assim vamos imprimir false

        // Operador ternario
        double nota = 6.0;
        String resultadoNota = nota >= 6 ? "Aprovado" : "Reprovado";

        System.out.println(resultadoNota);
    }
}
