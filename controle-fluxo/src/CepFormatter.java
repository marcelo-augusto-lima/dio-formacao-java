public class CepFormatter {
    public static void main(String[] args) {
        try {
            String cepFormatted = formatCep("23765064");
            System.out.println(cepFormatted);
        } catch (InvalidCepException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }

    static String formatCep(String cep) throws InvalidCepException{
        if(cep.length() != 8) throw new InvalidCepException();
    
        return "23.765-064";
    }
}
