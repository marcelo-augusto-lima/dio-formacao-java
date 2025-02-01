public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.0;

        // Estrutura condicional encadeada
        if (nota >= 7){
            System.out.println("Aprovado");
        }
        else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

        // Estrutura condional ternaria
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
