public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3) break;
            
            // A execução para quando a condição acima for satisfeita e a expressão for igual a "break"
            // Experimente alterar a expressão acima pela palavra reservada "continue" ou "break"
            // Caso a expressão acima for igual a "continue" e a condição for satisfeita ele vai pular para a proxima iteração

            System.out.println(numero);
        }
    }
}
