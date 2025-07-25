package exemplo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("8938429");
        //jeep.ligar();

        Moto cg150 = new Moto();
        cg150.setChassi("63761");
        //cg150.ligar();

        Veiculo coringa = cg150;
        coringa.ligar();
    }
}
