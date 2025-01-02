public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        this.volume += 1;
    }

    public void diminuirVolume(){
        this.volume -= 1;
    }

    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
    }

    public void aumentarCanal(){
        this.canal += 1;
    }

    public void diminuirCanal(){
        this.canal -= 1;
    }
}
